using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;

namespace TodoApp.Models
{
    public class Todo
    {
      
        public int Id { get; set; }
        public string Title { get; set; }
        public bool Urgent { get; set; }
        public bool Done { get; set; }
        public long CreatedAt { get; set; }

        public Todo()
        {
            CreatedAt = DateTimeOffset.Now.ToUnixTimeMilliseconds();
        }

        public Todo(string title) : this()
        {
            Title = title;
        }

        public Todo(int id, string title, bool urgent, bool done) : this(title)
        {
            Id = id;
            Urgent = urgent;
            Done = done;
        }

        public object GetFormattedCreationDate()
        {
            return (new DateTime(1970, 1, 1)).AddMilliseconds(CreatedAt);
        }
    }
}
