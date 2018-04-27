using Microsoft.AspNetCore.Mvc;

// For more information on enabling MVC for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace TodoApp.Controllers
{
    public class MainController : Controller
    {
        [HttpGet("/")]
        public IActionResult Index()
        {
            return Redirect("/login");
        }
    }
}
