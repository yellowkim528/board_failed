package com.kh.day12;

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
            System.out.println("도서 추가:1 , 도서 목록:2, 나가기:0");
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
                bcat.addToCatalogue(bookName,bookAuthor,bookPrice);
                continue;
            }
            // 도서 목록 보기
            if (choice == 2) {
                System.out.println(bcat.toString());
            } else {
                //  0,1,2 이외의 값 입력시 출력 메세지
                System.out.println("잘못 입력하셨습니다");
            }
        }
    }
}
