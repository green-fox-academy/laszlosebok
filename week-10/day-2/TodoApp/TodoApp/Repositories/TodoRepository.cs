using System.Collections.Generic;
using System.Linq;
using TodoApp.Entities;
using TodoApp.Models;

namespace TodoApp.Repositories
{
    public class TodoRepository : ITodoRepository
    {

        private readonly TodoContext todoContext;

        public TodoRepository(TodoContext todoContext)
        {
            this.todoContext = todoContext;
        }

        public List<Todo> FindAllTodos()
        {
            return todoContext.Todos.ToList();
        }

        public Todo FindTodoById(int id)
        {
            return todoContext.Todos.FirstOrDefault(todo => todo.Id == id);
        }

        public void SaveTodo(Todo todo)
        {
            todoContext.Update(todo);
            todoContext.SaveChanges();
        }

        public void DeleteTodo(Todo todo)
        {
            todoContext.Remove(todo);
            todoContext.SaveChanges();
        }

        public List<Todo> FindTodosByTitle(string title)
        {
            return todoContext.Todos.Where(todo => todo.Title.Contains(title)).ToList();
        }
    }
}
