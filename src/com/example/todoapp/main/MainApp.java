package com.example.todoapp.main;

import com.example.todoapp.model.Todo;
import com.example.todoapp.service.TodoService;

public class MainApp{

    public static void main(String argds[])
    {

        TodoService service = new TodoService();

        //create
        //service.addTodo(new Todo("Buy Groceries", "1", "Buy milk, eggs, and bread", "High", new java.util.Date()));
        service.addTodo(new Todo("Learn JDBC", "2","PostGreSQL, MySQL, Oracle connectivity","high",new java.util.Date()));
        service.addTodo(new Todo("Complete Assignment", "3","Finish the OOPD assignment by Friday","Medium",new java.util.Date()));
        service.addTodo(new Todo("Call Mom", "4","Check in with mom and see how she's doing","Low",new java.util.Date()));
        service.addTodo(new Todo("Go for a run", "5","Get some exercise and fresh air","Medium",new java.util.Date()));
        service.addTodo(new Todo("Read a book", "6","Relax and read a good book","Low",new java.util.Date()));
        service.addTodo(new Todo("Plan a trip", "7","Research and plan a weekend getaway","High",new java.util.Date()));

        //read
        System.out.println("Title " + "\t" + "ID" + "\t" + "Description" + "\t" + "Priority" + "\t" + "End Date" + "\t" + "Completed");
        service.getTodo().forEach(todo ->{
            System.out.println(todo.getTitle() + "\t" + todo.getId() + "\t" + todo.getDescription() + "\t" + todo.getPriority() + "\t" + todo.getEndDate00() + "\t" + todo.getCompleted());            System.out.println("ID: " + todo.getId());
         
        });
    }
}