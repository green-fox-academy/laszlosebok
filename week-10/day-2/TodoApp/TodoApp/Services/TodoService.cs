using System.Collections.Generic;
using TodoApp.Models;
using TodoApp.Repositories;

namespace TodoApp.Services
{
    public class TodoService : ITodoService
    {

        private readonly ITodoRepository todoRepository;

        public TodoService(ITodoRepository todoRepository)
        {
            this.todoRepository = todoRepository;
        }

        private List<Todo> GetAllTodos()
        {
            return todoRepository.FindAllTodos();
        }

        public void SaveTodo(Todo todo)
        {
            todoRepository.SaveTodo(todo);
        }

        public void DeleteTodoById(int id)
        {
            var todo = GetTodoById(id);
            if (todo != null)
            {
                todoRepository.DeleteTodo(todo);
            }
        }

        public Todo GetTodoById(int id)
        {
            return todoRepository.FindTodoById(id);
        }

        public List<Todo> GetTodoList(string search)
        {
            return search == null ? GetAllTodos() : todoRepository.FindTodosByTitle(search);
        }
    }
}
