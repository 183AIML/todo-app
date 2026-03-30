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
        todoDAO.add(t);
    }

    public List<Todo> getTodo()
    {
        return todoDAO.getAll();
    }
}
