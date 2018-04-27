namespace TodoApp.Models
{
    public class UserModel
    {
        
        public int Id { get; set; }
        public string Username { get; set; }
        public string Password { get; set; }

        public UserModel()
        {
        }

        public UserModel(int id, string username, string password) : this()
        {
            Id = id;
            Username = username;
            Password = password;
        }
    }
}
