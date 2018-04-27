using System.Collections.Generic;
using System.Linq;
using TodoApp.Entities;
using TodoApp.Models;

namespace TodoApp.Repositories
{
    public class UserModelRepository : IUserModelRepository
    {
    
        private readonly TodoContext todoContext;

        public UserModelRepository(TodoContext todoContext)
        {
            this.todoContext = todoContext;
        }


        public void Save(UserModel newUser)
        {
            todoContext.Update(newUser);
            todoContext.SaveChanges();
        }

        public List<string> GetAllUsernames()
        {
            return todoContext.Users
                .Select(user => user.Username)
                .ToList();
        }

        public UserModel GetUserByUsername(string username)
        {
            return todoContext.Users.FirstOrDefault(user => user.Username.Equals(username));
        }
    }
}
