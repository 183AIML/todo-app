package com.example.todoapp.model;
import java.util.Date;

public class Todo {
    private String title;
    private String id;  
    private String description;
    private String priority;    
    private Date endDate00;
    private boolean completed;

    public Todo(String title, String id, String description, String priority, Date endDate00) {
        this.title = title;
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.endDate00 = endDate00; 
        this.completed = false;
    }       

    //getters and setters methods

    public String getTitle() {
        return title;
    }
     
    public String getId() { 
        return id;
    }   
    public String getDescription() {
        return description;
    }   
    public String getPriority() {
        return priority;
    }

    public Date getEndDate00() {
        return endDate00;
    }

    public void setEndDate00(Date endDate00) {
        this.endDate00 = endDate00;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}