using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using TodoApp.Models;

namespace TodoApp.Entities
{
    public partial class TodoContext : DbContext
    {
        public virtual DbSet<Todo> Todos { get; set; }

        public TodoContext(DbContextOptions options) : base(options)
        {
            
        }
    }
}
