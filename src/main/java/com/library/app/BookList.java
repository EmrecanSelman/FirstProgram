package com.library.app;

import Otomat.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookList extends BookAndOccupation {

    public static void ekle(String pagenumber, String writer, String bookname) throws SQLException {


        DBHelper database = new DBHelper();
        Connection connection;
        PreparedStatement statement;
        try {
            connection = database.getConnection();
            String sql = "insert into booklist.booklist (pagenumber,writer,bookname) values (?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, pagenumber);
            statement.setString(2, writer);
            statement.setString(3, bookname);
            statement.executeUpdate();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }


    }

    public static void sil(int id) {
        DBHelper database = new DBHelper();
        Connection connection;
        PreparedStatement statement;
        try {
            connection = database.getConnection();
            String SQL = "DELETE FROM booklist.booklist WHERE id = (?)";
            statement = connection.prepareStatement(SQL);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }


}
