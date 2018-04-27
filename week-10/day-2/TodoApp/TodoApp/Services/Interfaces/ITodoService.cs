using System.Collections.Generic;
using TodoApp.Models;

namespace TodoApp.Services
{
    public interface ITodoService
    {
        void SaveTodo(Todo todo);
        void DeleteTodoById(int id);
        Todo GetTodoById(int id);
        List<Todo> GetTodoList(string search);
    }
}
