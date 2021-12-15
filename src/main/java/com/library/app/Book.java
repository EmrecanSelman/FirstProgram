package com.library.app;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Book {
    public int id;
    public String pagenumber;
    public String writer;
    public String bookname;

    public Book(int id, String pagenumber, String writer, String bookname) {
        this.id = id;
        this.pagenumber = (pagenumber);
        this.writer = (writer);
        this.bookname = (bookname);
    }

}


