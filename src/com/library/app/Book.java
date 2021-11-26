package com.library.app;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

public class Book {
      private String pagenumber,bookname,writer;
      private StringProperty pagenumberpro,booknamepro,writerpro;

    public Book(String pagenumber, String bookname, String writer) {
        this.pagenumber = pagenumber;
        this.bookname = bookname;
        this.writer = writer;
    }
    public Book(){
        this.pagenumberpro = new SimpleStringProperty();
        this.writerpro = new SimpleStringProperty();
        this.booknamepro = new SimpleStringProperty();
    }

    public String getPagenumber() {
        return pagenumber;
    }

    public void setPagenumber(String pagenumber) {
        this.pagenumber = pagenumber;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPagenumberpro() {
        return pagenumberpro.get();
    }

    public StringProperty pagenumberproProperty() {
        return pagenumberpro;
    }

    public void setPagenumberpro(String pagenumberpro) {
        this.pagenumberpro.set(pagenumberpro);
    }

    public String getBooknamepro() {
        return booknamepro.get();
    }

    public StringProperty booknameproProperty() {
        return booknamepro;
    }

    public void setBooknamepro(String booknamepro) {
        this.booknamepro.set(booknamepro);
    }

    public String getWriterpro() {
        return writerpro.get();
    }

    public StringProperty writerproProperty() {
        return writerpro;
    }

    public void setWriterpro(String writerpro) {
        this.writerpro.set(writerpro);
    }
    public ObservableValue<String> getpagenumberValue() {
        return pagenumberpro;
    }

    public ObservableValue<String> getwriterValue() {
        return writerpro;
    }
    public ObservableValue<String> getbooknameValue() {
        return booknamepro;
    }

}
