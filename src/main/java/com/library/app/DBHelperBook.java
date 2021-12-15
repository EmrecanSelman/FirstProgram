package com.library.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelperBook {
    public Connection getConnection( ) throws SQLException {
        final String username = "root";
        final String password = "7008134258";
        final String dbUrl = "jdbc:mysql://localhost:3306/booklist";

        return DriverManager.getConnection(dbUrl,username,password);
    }
    public void ShowErrorMessage(SQLException exception){
        System.out.println("Error :" + exception.getMessage());
        System.out.println("Error code :" + exception.getErrorCode());
    }
}


