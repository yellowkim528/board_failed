package com.kh.day12.test;

public class BookCatalogue {
    private Book[] catalogue;
    private int capacity;
    private int bookCount;


    public BookCatalogue() {
        this.capacity = 10;
        this.catalogue = new Book[capacity];
    }

    public void addToCatalogue(Book book) {
        if (bookCount < capacity) {
            catalogue[bookCount++] = book;
            System.out.println("도서가 추가되었습니다.");
        } else {
            System.out.println("도서 목록이 가득찼습니다.");
        }

    }

    public void updateBook(int bookNum,Book updateBook) {
        if(bookNum<0 || bookNum>=bookCount) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        catalogue[bookNum] = updateBook;
        System.out.println(bookNum+"번 도서가 수정되었습니다.");

    }

    public void deleteBook(int bookNum) {
        if(bookNum<0 || bookNum>=bookCount) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        for (int i = bookNum; i < bookCount-1; i++) {
            catalogue[i] = catalogue[i + 1];
        }
        catalogue[bookCount - 1] = null; // 마지막 요소를 null로 설정하여 메모리 누수 방지
        bookCount--;
    }

    public void searchBook(String name) {
        for (int i = 0; i < bookCount; i++) {
            if (catalogue[i].getName().equals(name)) {
                System.out.println("도서를 찾았습니다 :\n" + catalogue[i]);
                return;
            }
        }
        System.out.println("해당 도서를 찾을 수 없습니다.");
    }

    @Override
    public String toString() {
        String str = "현재도서목록 \n";
        for (int i = 0; i < catalogue.length; i++) {
            if (catalogue[i] == null) {
                break;
            }
            str += i + 1 + "번째 도서" + "\n";
            str += catalogue[i];

        }
        return str;
    }

    public Book[] getCatalogue() {
        return catalogue;
    }
}

