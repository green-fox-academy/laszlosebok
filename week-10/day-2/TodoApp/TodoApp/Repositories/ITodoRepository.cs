using System.Collections.Generic;
using TodoApp.Models;

namespace TodoApp.Repositories
{
    public interface ITodoRepository
    {
        List<Todo> FindAllTodos();
        Todo FindTodoById(int id);
        void SaveTodo(Todo todo);
        void DeleteTodo(Todo todo);
        List<Todo> FindTodosByTitle(string title);
    }
}
