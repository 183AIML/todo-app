package com.example.todoapp.model;
import java.sql.Date;

public class Todo {
    private String title;
    private String id;  
    private String description;
    private String priority;    
    private Date endDate;
    private boolean completed;

    public Todo(String title, String id, String description, String priority, Date endDate, boolean completed) {
        this.title = title;
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.endDate = endDate;
        this.completed = completed;
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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}