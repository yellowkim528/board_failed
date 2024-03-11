package com.kh.day12;

public class BookCatalogue {
    private Book[] catalogue;
    private int capacity;
    private int bookCount;


    public BookCatalogue() {
        this.capacity = 10;
        this.catalogue = new Book[capacity];
        this.bookCount = 0;
    }

    public void addToCatalogue(String name, String author, int price) {
        if (bookCount < capacity) {
            catalogue[bookCount] = new Book(name, author, price);
            bookCount++;
            System.out.println("도서가 추가되었습니다.");
        } else {
            System.out.println("도서 목록이 가득찼습니다.");
        }

    }

    @Override
    public String toString() {
        String str = "현재도서목록 \n";
        for (int i = 0; i < catalogue.length; i++) {
            if (catalogue[i] == null) {
                break;
            }
            str += catalogue[i];
        }
        return str;
    }
}

