package com.px.pojo;

/**
 * Created by zhengjq on 2017/5/12.
 */
public class Book {
    private long bookId;// 图书ID

    private String name;// 图书名称

    private int number;// 馆藏数量
    public Book(){

    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
