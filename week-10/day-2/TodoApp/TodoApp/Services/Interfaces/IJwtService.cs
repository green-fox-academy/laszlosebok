namespace TodoApp.Services
{
    public interface IJwtService
    {
        string GenerateJwt(string username);
    }
}
