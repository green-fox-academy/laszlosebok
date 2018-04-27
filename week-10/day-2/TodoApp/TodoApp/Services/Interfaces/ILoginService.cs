using TodoApp.Models.DTO;

namespace TodoApp.Services
{
    public interface ILoginService
    {
        string LoginUser(UserDto user);
    }
}
