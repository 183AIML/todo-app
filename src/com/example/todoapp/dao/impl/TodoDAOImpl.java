package com.example.todoapp.dao.impl;

import java.sql.*;
import java.util.*;

import com.example.todoapp.model.Todo;
import com.example.todoapp.util.DBConnection;

public class TodoDAOImpl{

    //insert record
    public void add(Todo t){

        try(Connection con = DBConnection.getConnection()){

            String sql = "INSERT INTO todo (title, id, description, priority, end_date, completed) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, t.getTitle());
            pstmt.setString(2, t.getId());
            pstmt.setString(3, t.getDescription());
            pstmt.setString(4, t.getPriority());
            pstmt.setDate(5, new java.sql.Date(t.getEndDate00().getTime()));
            pstmt.setBoolean(6, t.getCompleted());
            pstmt.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }

    
    }

    //read record
    public List<Todo>getAll(){
    
    List<Todo> list = new ArrayList<>();
    try(Connection con = DBConnection.getConnection()){

        PreparedStatement  ps = con.prepareStatement("Select * FROM todo");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            list.add(new Todo(
                rs.getString("title"),
                rs.getString("id"),
                rs.getString("description"),
                rs.getString("priority"),
                rs.getDate("end_date")
            ));
          }
    }
    catch(SQLException e){
        System.out.println(e);

    }

    return list;
}
}