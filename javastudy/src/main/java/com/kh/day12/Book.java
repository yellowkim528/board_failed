package com.kh.day12;

public class Book {
    private String name;
    private String author;
    private int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        String str = "";
        str += "도서명 : " + name + "\n";
        str += "저자 : " + author + "\n";
        str += "가격 : " + price + "\n";
        return str;
    }
}
