using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace HelloWorldWebApp.Models
{
    public class Greeting
    {
        private static int _baseId = 1;
        public long Id { get; set; }
        public string Content { get; set; }

        public Greeting()
        {
            Id = _baseId++;
            Content = "Hello, World!";
        }

        public Greeting(string name)
        {
            Id = _baseId++;
            Content = "Hello, " + name + "!";
        }
    }
}
