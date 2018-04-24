using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using TodoApp.Models;
using TodoApp.Services;

// For more information on enabling MVC for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace TodoApp.Controllers
{
    public class TodoWebController : Controller
    {

        private readonly TodoService todoService;

        public TodoWebController(TodoService todoService)
        {
            this.todoService = todoService;
        }

        [HttpGet("")]
        public IActionResult Index()
        {
            var todos = todoService.GetAllTodos();
            return View(todos);
        }

        [HttpGet("/add")]
        public IActionResult ShowAddForm()
        {
            return View("add-form");
        }

        [HttpPost("/add")]
        public IActionResult AddTodo(Todo todo)
        {
            todoService.SaveTodo(todo);
            return Redirect("/");
        }

        [HttpGet("/delete/{id}")]
        public IActionResult DeleteTodo(int id)
        {
            todoService.DeleteTodoById(id);
            return Redirect("/");
        }

        [HttpGet("/edit/{id}")]
        public IActionResult ShowEditForm(int id)
        {
            var todo = todoService.GetTodoById(id);
            return View("edit-form", todo);
        }

        [HttpPost("/edit/{id}")]
        public IActionResult EditTodo(int id, Todo todo)
        {
            todoService.SaveTodo(todo);
            return Redirect("/");
        }
    }
}
