using System;
using System.IdentityModel.Tokens.Jwt;
using System.Security.Claims;
using System.Text;
using Microsoft.AspNetCore.Authorization.Infrastructure;
using Microsoft.AspNetCore.Mvc;
using Microsoft.IdentityModel.Tokens;

namespace TodoApp.Services
{
    public class JwtService : IJwtService
    {

        private readonly IHashingService hashingService;

        public JwtService(IHashingService hashingService)
        {
            this.hashingService = hashingService;
        }

        public string GenerateJwt(string username)
        {
            var claims = new[]
            {
                new Claim(JwtRegisteredClaimNames.Sub, username),
                new Claim(JwtRegisteredClaimNames.Jti, Guid.NewGuid().ToString())
            };

            var secret = Environment.GetEnvironmentVariable("JWT_SECRET");
            var signingKey = new SymmetricSecurityKey(Encoding.ASCII.GetBytes(secret));
            var creds = new SigningCredentials(signingKey, SecurityAlgorithms.HmacSha256);

            var token = new JwtSecurityToken(
                audience: "todoapp",
                issuer: "todoapp",
                claims: claims,
                expires: DateTime.UtcNow.AddDays(1),
                signingCredentials: creds
                );

            return new JwtSecurityTokenHandler().WriteToken(token);
        }

        public string GenerateJwtDisabled(string username)
        {
            var currentTime = DateTimeOffset.UtcNow.ToUnixTimeSeconds();
            var expTime = currentTime + 24 * 3600;

            const string header = "{\"typ\":\"JWT\",\"alg\":\"HS256\"}";
            var claims = "{\"username\":\"" + username + "\",\"iat\":" + currentTime + ",\"exp\":" + expTime + ",\"aud\":\"todoapp\"}";

            var b64Header = Convert.ToBase64String(Encoding.UTF8.GetBytes(header))
                .Replace('+', '-')
                .Replace('/', '_')
                .Replace("=", "");
            var b64Claims = Convert.ToBase64String(Encoding.UTF8.GetBytes(claims))
                .Replace('+', '-')
                .Replace('/', '_')
                .Replace("=", "");

            var payload = b64Header + "." + b64Claims;

            var b64Key = Environment.GetEnvironmentVariable("JWT_SECRET");
            var key = Convert.FromBase64String(b64Key);
            var message = Encoding.UTF8.GetBytes(payload);

            var sig = Convert.ToBase64String(hashingService.HashHmac(key, message))
                .Replace('+', '-')
                .Replace('/', '_')
                .Replace("=", "");

            Console.WriteLine(payload + "." + sig);
            return payload + "." + sig;
        }
    }
}
