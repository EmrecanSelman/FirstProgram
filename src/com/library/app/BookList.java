package com.library.app;

import Otomat.DBHelper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookList extends BookAndOccupation{
    Otomat.DBHelper database = new DBHelper();





    public ObservableList<Book> göster() throws SQLException
    {

        Connection connection = database.getConnection();
        ObservableList<Book> list = FXCollections.observableArrayList();
        PreparedStatement ps = connection.prepareStatement("SELECT * from booklist");
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {

        }
        return list;
    }
   void ekle(String pagenumber,String writer,String bookname) throws SQLException{


       DBHelper database = new DBHelper();
       Connection connection;
       PreparedStatement statement;
       try {
           connection = database.getConnection();
           String sql = "insert into booklist.booklist (pagenumber,writer,bookname) values (?,?,?)";
           statement = connection.prepareStatement(sql);
           statement.setString(1,pagenumber);
           statement.setString(2,writer);
           statement.setString(3,bookname);
           statement.executeUpdate();

       } catch (SQLException exception) {
           exception.printStackTrace();
       }


   }
   void sil() throws SQLException{
       DBHelper database = new DBHelper();
       Connection connection;
       PreparedStatement statement;
       try {
           connection = database.getConnection();
           String sql = "insert into booklist.booklist (pagenumber,writer,bookname) values (?,?,?)";
           statement = connection.prepareStatement(sql);

       } catch (SQLException exception) {
           exception.printStackTrace();
       }

   }




}
