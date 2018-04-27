using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using TodoApp.Models.DTO;
using TodoApp.Services;

// For more information on enabling MVC for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace TodoApp.Controllers
{
    [Route("api")]
    public class AuthRestController : Controller
    {

        private readonly ILoginService loginService;
        private readonly ITodoService todoService;

        public AuthRestController (ILoginService loginService,
                                   ITodoService todoService)
        {
            this.loginService = loginService;
            this.todoService = todoService;
        }

        [HttpPost("auth")]
        public JsonResult Index([FromBody] UserDto user)
        {
            var token = loginService.LoginUser(user);
            return (token != null) ? Json(token) : Json("Unauthorized");
        }

        [Authorize]
        [HttpGet("list")]
        public JsonResult GetList()
        {
            return Json(todoService.GetTodoList(null));
        }
    }
}
