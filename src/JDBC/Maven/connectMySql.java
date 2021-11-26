package JDBC.Maven;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class connectMySql {
    static String username ="root";
    static String password ="7008134258";
    static String dbUrl ="jdbc:mysql://localhost:3306/world";
    public static void main(String[] args) throws SQLException {
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(dbUrl, username, password);
            System.out.println("bağlandı");
        }
        catch (SQLException exception0){
            System.out.println("hata oldu");
        }
    }}


