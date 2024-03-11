package com.kh.day11.q3;

public class Book {
    private String title;
    private String author;
    private int price;


    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String str = "";
        str += "도서명 : " + title + "\n";
        str += "저자 : " + author + "\n";
        str += "가격 : " + price + "\n";
        return str;


    }
}
