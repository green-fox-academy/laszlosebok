using TodoApp.Models;
using TodoApp.Models.DTO;
using TodoApp.Repositories;

namespace TodoApp.Services
{
    public class RegistrationService : IRegistrationService
    {
        private readonly IHashingService hashingService;
        private readonly IUserModelRepository userModelRepository;

        public RegistrationService(IUserModelRepository userModelRepository,
                                   IHashingService hashingService)
        {
            this.userModelRepository = userModelRepository;
            this.hashingService = hashingService;
        }

        public string RegisterUser(UserDto user)
        {
            if (!VerifyPassword(user) || !VerifyUsername(user.Username))
                return "/register";

            var newUser = CreateNewUserFromUserDto(user);
            userModelRepository.Save(newUser);
            return "/login";
        }

        private static bool VerifyPassword(UserDto user)
        {
            return user.Password.Equals(user.PasswordVerification);
        }

        private bool VerifyUsername(string username)
        {
            var users = userModelRepository.GetAllUsernames();
            return !users.Contains(username);
        }

        private UserModel CreateNewUserFromUserDto(UserDto user)
        {
            return new UserModel
            {
                Username = user.Username,
                Password = hashingService.CreateMd5(user.Password)
            };
        }
    }
}
