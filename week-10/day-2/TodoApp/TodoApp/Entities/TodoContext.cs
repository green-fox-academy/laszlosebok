using Microsoft.EntityFrameworkCore;
using TodoApp.Models;

namespace TodoApp.Entities
{
    public class TodoContext : DbContext
    {
        public virtual DbSet<Todo> Todos { get; set; }
        public virtual DbSet<UserModel> Users { get; set; }

        public TodoContext(DbContextOptions options) : base(options)
        {
            
        }
    }
}
