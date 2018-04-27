using System.Collections.Generic;
using TodoApp.Models;

namespace TodoApp.Repositories
{
    public interface IUserModelRepository
    {
        void Save(UserModel newUser);
        List<string> GetAllUsernames();
        UserModel GetUserByUsername(string username);
    }
}
