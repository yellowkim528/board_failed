package com.kh.day12.test;

import java.util.Scanner;

public class CatalogueDriver {
    public static void main(String[] args) {
        BookCatalogue bcat = new BookCatalogue();
        String bookName;
        String bookAuthor;
        int bookPrice;
        Scanner scanner = new Scanner(System.in);

        boolean flag = false;
        while (!flag) {
            System.out.println("추가:1,수정:2,삭제:3,검색:4,목록:5,나가기:0");
            int choice = scanner.nextInt();
            scanner.nextLine();
            // 나가기
            if (choice == 0) {
                flag = true;
                continue;
            }
            // 도서 추가
            if (choice == 1) {
                System.out.println("추가하는 도서의 이름 :");
                bookName = scanner.nextLine();
                System.out.println("추가하는 도서의 저자 :");
                bookAuthor = scanner.nextLine();
                System.out.println("추가하는 도서의 가격 :");
                bookPrice = scanner.nextInt();
                scanner.nextLine();
                Book book = new Book(bookName, bookAuthor, bookPrice);
                bcat.addToCatalogue(book);
                continue;
            }
            // 도서 수정
            if (choice == 2) {
                System.out.println(bcat);
                System.out.println("수정하실 도서의 번호를 입력하세요 : (이전:0)");
                int change = scanner.nextInt();
                scanner.nextLine();
                if (change == 0) {
                    continue;
                }
                System.out.println("수정하는 도서의 이름 :");
                bookName = scanner.nextLine();
                System.out.println("수정하는 도서의 저자 :");
                bookAuthor = scanner.nextLine();
                System.out.println("수정하는 도서의 가격 :");
                bookPrice = scanner.nextInt();
                Book book2 = new Book(bookName, bookAuthor, bookPrice);
                bcat.updateBook(change - 1, book2);
                continue;
            }

            // 도서 삭제
            if (choice == 3) {
                System.out.println("삭제하실 도서의 번호를 입력하세요 : (이전:0)");
                int delete = scanner.nextInt();
                scanner.nextLine();
                if (delete == 0) {
                    continue;
                }
                bcat.deleteBook(delete-1);
                System.out.println(delete+"번 도서가 삭제되었습니다");
                continue;
            }

            // 도서 검색
            if (choice == 4) {
                System.out.println("검색하실 도서의 이름을 입력하세요 : (이전:0)");
                String search = scanner.nextLine();
                bcat.searchBook(search);
                continue;
            }


            // 도서 목록 보기
            if (choice == 5) {
                System.out.println(bcat);
            } else {
                //  0,1,2 이외의 값 입력시 출력 메세지
                System.out.println("잘못 입력하셨습니다");
            }
        }
    }
}
