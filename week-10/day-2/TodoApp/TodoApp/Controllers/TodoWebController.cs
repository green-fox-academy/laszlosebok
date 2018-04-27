using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Cors;
using Microsoft.AspNetCore.Mvc;
using TodoApp.Models;
using TodoApp.Services;

// For more information on enabling MVC for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace TodoApp.Controllers
{
    [Authorize]
    [EnableCors("AnyGET")]
    public class TodoWebController : Controller
    {

        private readonly ITodoService todoService;

        public TodoWebController(ITodoService todoService)
        {
            this.todoService = todoService;
        }

        [HttpGet("/list")]
        public IActionResult Index(string search)
        {
            var todos = todoService.GetTodoList(search);
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
            return Redirect("/list");
        }

        [HttpGet("/delete/{id}")]
        public IActionResult DeleteTodo(int id)
        {
            todoService.DeleteTodoById(id);
            return Redirect("/list");
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
            return Redirect("/list");
        }
    }
}
