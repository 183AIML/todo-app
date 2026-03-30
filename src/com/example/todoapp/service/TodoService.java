package com.example.todoapp.service;

import java.util.List;
import com.example.todoapp.dao.impl.TodoDAOImpl;
import com.example.todoapp.model.Todo;

public class TodoService {
    
    private TodoDAOImpl todoDAO;

    public TodoService() {
        this.todoDAO = new TodoDAOImpl();
    }

    public void addTodo(Todo t) {
        todoDAO.addTodo(t);
    }

    public List<Todo> getAllTodos()
    {
        return todoDAO.getAllTodos();
    }
    public Todo getTodoById(String id){
        return todoDAO.getTodoById(id);
    }
    public void updateTodo(Todo t){
        todoDAO.updateTodo(t);}

}
