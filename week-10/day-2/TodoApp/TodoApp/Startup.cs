using System;
using System.Text;
using Microsoft.AspNetCore.Authentication.JwtBearer;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.IdentityModel.Tokens;
using TodoApp.Entities;
using TodoApp.Repositories;
using TodoApp.Services;

namespace TodoApp
{
    public class Startup
    {
        // This method gets called by the runtime. Use this method to add services to the container.
        // For more information on how to configure your application, visit https://go.microsoft.com/fwlink/?LinkID=398940
        public void ConfigureServices(IServiceCollection services)
        {
            services.AddMvc();

            var connection = Environment.GetEnvironmentVariable("DB_CONNECTION");
            services.AddDbContext<TodoContext>(
                options => options.UseSqlServer(connection)
                );

            var secret = Environment.GetEnvironmentVariable("JWT_SECRET");
            var signingKey = new SymmetricSecurityKey(Encoding.ASCII.GetBytes(secret));
        

            var tokenValidationParameters = new TokenValidationParameters
            {
                RequireExpirationTime = true,
                RequireSignedTokens = true,
                ValidateIssuerSigningKey = true,
                IssuerSigningKey = signingKey,
                ValidateAudience = true,
                ValidAudience = "todoapp",
                ValidateIssuer = true,
                ValidIssuer = "todoapp",
                ValidateLifetime = true,
                ClockSkew = TimeSpan.Zero
            };

            services.AddAuthentication(options =>
            {
                options.DefaultScheme = JwtBearerDefaults.AuthenticationScheme;
            }).AddJwtBearer(options =>
            {
                options.TokenValidationParameters = tokenValidationParameters;
                options.SaveToken = true;
            });

            services.AddScoped<ILoginService, LoginService>();
            services.AddScoped<ITodoService, TodoService>();
            services.AddScoped<IJwtService, JwtService>();
            services.AddScoped<IHashingService, HashingService>();
            services.AddScoped<IRegistrationService, RegistrationService>();
            services.AddScoped<ITodoRepository, TodoRepository>();
            services.AddScoped<IUserModelRepository, UserModelRepository>();
        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IHostingEnvironment env)
        {
            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
            }

            app.UseAuthentication();
            app.UseStaticFiles();
            app.UseMvc();
        }
    }
}
