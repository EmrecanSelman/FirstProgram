package com.library.app;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.util.Callback;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowBook extends Pane {
BookList bookList = new BookList();
static DBHelper helper = new DBHelper();
    @FXML
    private TableView<Book> tableview;
    @FXML
    private TreeTableColumn <Book,String>pageNumberCol;

    @FXML
    private TreeTableColumn <Book,String> bookNameCol;

    @FXML
    private TreeTableColumn<Book,String> writerNameCol;

    @FXML
    private Button showPageComeBack;
    ShowBook() throws SQLException, ClassNotFoundException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowBook.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        tableInit();

    }


public void onEdit(){
    if (tableview.getSelectionModel().getSelectedItem() != null) {
        pageNumberCol.setCellValueFactory(cellData -> cellData.getValue().getValue().getpagenumberValue());
        writerNameCol.setCellValueFactory(cellData -> cellData.getValue().getValue().getwriterValue());
        bookNameCol.setCellValueFactory(cellData -> cellData.getValue().getValue().getbooknameValue());

        Book book = tableview.getSelectionModel().getSelectedItem();

    }

}
    @FXML
    private void tableInit(){
        pageNumberCol.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Book, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Book, String> param) {
                return param.getValue().getValue().getpagenumberValue();
            }
        });
        writerNameCol.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Book, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Book, String> param) {
                return param.getValue().getValue().getwriterValue();
            }
        });
        bookNameCol.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Book, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Book, String> param) {
                return param.getValue().getValue().getbooknameValue();
            }
        });

        ObservableList<Book> bookliat = null;
        try {
            bookliat = getAllData();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        populateTable (bookliat);

    }
    private static ObservableList<Book> getAllData() throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM booklist.booklist";

        try{
            ResultSet rs = helper.getConnection().createStatement().executeQuery(sql);
            return getContactObjects(rs);
        } catch (SQLException e){
            System.out.println("Problem");
            e.printStackTrace();
            throw e;
        }


    }
    private static ObservableList<Book> getContactObjects(ResultSet rs) throws SQLException {

        try {
            ObservableList<Book> bookliat = FXCollections.observableArrayList();

            while (rs.next()) {
                Book book = new Book();
                book.setPagenumberpro(rs.getString(1));
                book.setWriterpro(rs.getString(2));
                book.setBooknamepro(rs.getString(3));
                bookliat.add(book);
            }
            return bookliat;
        } catch (SQLException e) {
            System.out.println("Problem 1");
            e.printStackTrace();
            throw e;
        }

    }

    private void populateTable(ObservableList<Book> bookliat) {
        tableview.setItems(bookliat);
    }
}




