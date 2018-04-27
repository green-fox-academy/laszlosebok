using TodoApp.Models.DTO;

namespace TodoApp.Services
{
    public interface IRegistrationService
    {
        string RegisterUser(UserDto user);
    }
}
