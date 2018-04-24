using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

// For more information on enabling Web API for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace HelloWorldWebApp.Controllers
{
    [Route("api")]
    public class RESTController : Controller
    {
        [Route("greeting")]
        public JsonResult Greeting(string name)
        {
            return name != null ? new JsonResult(new Models.Greeting(name)) : new JsonResult(new Models.Greeting());
        }
    }
}
