package com.kh.day11.q3;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("해리포터와 죽음의 성물", "J.K롤링", 16000);

        System.out.println("도서명 : " + book.getTitle());
        System.out.println("저자 : " + book.getAuthor());
        System.out.println("가격 : " + book.getPrice());

        book.setTitle("해리포터와 불사조기사단");
        book.setAuthor("조앤킹롤링");
        book.setPrice(10000);

        System.out.println(book.toString());;


    }
}
