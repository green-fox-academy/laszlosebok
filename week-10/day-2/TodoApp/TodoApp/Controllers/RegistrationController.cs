using Microsoft.AspNetCore.Mvc;
using TodoApp.Models.DTO;
using TodoApp.Services;

namespace TodoApp.Controllers
{
    public class RegistrationController : Controller
    {

        private readonly IRegistrationService registrationService;

        public RegistrationController(IRegistrationService registrationService)
        {
            this.registrationService = registrationService;
        }

        [HttpGet("/register")]
        public IActionResult ShowRegistrationPage()
        {
            return View("register");
        }

        [HttpPost("/register")]
        public IActionResult Register(UserDto user)
        {
            var redirectDestination = registrationService.RegisterUser(user);
            return Redirect(redirectDestination);
        }
    }
}
