using TodoApp.Models.DTO;
using TodoApp.Repositories;

namespace TodoApp.Services
{
    public class LoginService : ILoginService
    {
        private readonly IJwtService jwtService;
        private readonly IUserModelRepository userModelRepository;
        private readonly IHashingService hashingService;

        public LoginService(IUserModelRepository userModelRepository,
                            IJwtService jwtService,
                            IHashingService hashingService)
        {
            this.userModelRepository = userModelRepository;
            this.jwtService = jwtService;
            this.hashingService = hashingService;
        }


        public string LoginUser(UserDto user)
        {
            return LoginInfoVerification(user) ? jwtService.GenerateJwt(user.Username) : null;
        }

        private bool LoginInfoVerification(UserDto user)
        {
            var username = user.Username;
            return VerifyLoginUsername(username) && VerifyLoginPassword(username ,user.Password);

        }

        private bool VerifyLoginPassword(string username, string password)
        {
            var user = userModelRepository.GetUserByUsername(username);
            var encryptedPass = hashingService.CreateMd5(password);
            return user.Password.Equals(encryptedPass);
        }

        private bool VerifyLoginUsername(string username)
        {
            var usernames = userModelRepository.GetAllUsernames();
            return usernames.Contains(username);
        }
    }
}
