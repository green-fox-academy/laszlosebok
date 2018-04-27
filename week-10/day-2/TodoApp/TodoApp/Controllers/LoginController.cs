using System;
using Microsoft.AspNetCore.Mvc;
using TodoApp.Models.DTO;
using TodoApp.Services;

// For more information on enabling MVC for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace TodoApp.Controllers
{
    public class LoginController : Controller
    {

        private readonly ILoginService loginService;

        public LoginController(ILoginService loginService)
        {
            this.loginService = loginService;
        }

        [HttpGet("/login")]
        public IActionResult ShowLoginPage()
        {
            return View("login");
        }

        [HttpPost("/login")]
        public IActionResult Login(UserDto user)
        {
            var jwtToken = loginService.LoginUser(user);
            Console.WriteLine(jwtToken);
            return (jwtToken == null) ? Redirect("/login") : Redirect("/list");
        }
    }
}
