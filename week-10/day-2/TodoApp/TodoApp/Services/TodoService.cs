using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoApp.Models;
using TodoApp.Repositories;

namespace TodoApp.Services
{
    public class TodoService
    {

        private readonly ITodoRepository todoRepository;

        public TodoService(ITodoRepository todoRepository)
        {
            this.todoRepository = todoRepository;
        }

        public List<Todo> GetAllTodos()
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
    }
}
