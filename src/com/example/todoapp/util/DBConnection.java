package com.example.todoapp.util;

import java.sql.*;
public class DBConnection {

public static Connection getConnection() throws SQLException
{
    String url = "jdbc:postgresql://localhost:5432/todoappDB";
    
    try
    {
        Class.forName("org.postgresql.Driver");
    }
    catch(ClassNotFoundException e)
    {
        System.out.println(e);
    }
    return DriverManager.getConnection(url, "postgres", "1234");
}
}