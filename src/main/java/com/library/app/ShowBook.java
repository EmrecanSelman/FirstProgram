package com.library.app;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.sql.*;


public class ShowBook extends Pane {
    DBHelperBook helper = new DBHelperBook();
    @FXML
    private TableView<Book> tableview;
    @FXML
    private TableColumn<Book, String> pageNumberCol;

    @FXML
    private TableColumn<Book, String> bookNameCol;

    @FXML
    private TableColumn<Book, String> writerNameCol;

    @FXML
    private Button showPageComeBack;
    @FXML
    private Button eraseBookButton;

    ShowBook() {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/library/ShowBook.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
       ;

        pageNumberCol.setCellValueFactory(cell-> new SimpleStringProperty(cell.getValue().pagenumber));
        bookNameCol.setCellValueFactory(cell-> new SimpleStringProperty(cell.getValue().bookname));
        writerNameCol.setCellValueFactory(cell-> new SimpleStringProperty(cell.getValue().writer));
        refreshBooksView();

        showPageComeBack.setOnMouseClicked(event -> {
            BookAndOccupation es = new BookAndOccupation();
            Scene scene = new Scene(es);
            Main.MAIN_STAGE.setScene(scene);
        });

        tableview.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            eraseBookButton.setDisable(newValue == null);
        });
        eraseBookButton.setOnMouseClicked(event -> {
            Book selectedItem = tableview.getSelectionModel().getSelectedItem();
            BookList.sil(selectedItem.id);
            refreshBooksView();
        });
    }

    public void refreshBooksView() {
        tableview.getItems().clear();
        ObservableList<Book> books = getBookData();
        System.out.println(books.size() + " tane book bulunmaktadır.");
        tableview.getItems().addAll(books);
    }

    public Connection getConnection() {
        try {
            Connection connection = helper.getConnection();
            return connection;
        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public ObservableList<Book> getBookData() {
        ObservableList<Book> booklist = FXCollections.observableArrayList();
        String sql = "SELECT * FROM booklist.booklist";
        Statement st;
        ResultSet rs;
        Connection connection = getConnection();

        try {
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Book book=new Book(rs.getInt("id"), rs.getString("pagenumber"), rs.getString(2), rs.getString("bookname"));
                booklist.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return booklist;
    }


}




