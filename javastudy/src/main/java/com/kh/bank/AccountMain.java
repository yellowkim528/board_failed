package com.kh.bank;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account accounts = new Account();

        // 메뉴 선택

        boolean stop = false;
        while (!stop) {
            System.out.println("---------------------------------------------------------------");
            System.out.println(" 1.신규|2.폐지|3.입금|4.출금|5.계좌조회(개별)|6.계좌조회(전체)|7.종료");
            System.out.println("---------------------------------------------------------------");

            int menu = scanner.nextInt();
            scanner.nextLine();

            // 1.신규
            if (menu == 1) {
                System.out.println("새 계좌의 예금주 이름을 입력하세요.");
                String accountName = scanner.nextLine();
                accounts.addAccount(accountName);
                System.out.println("계좌가 개설되었습니다.");
                continue;
            }
            // 2.폐지
            if (menu == 2) {
                System.out.println("삭제할 계좌번호를 입력해 주세요.");
                String num;
                int nam = scanner.nextInt();
                scanner.nextLine();
                if (nam < 10) {
                    num = "00" + nam;
                } else if (nam < 100) {
                    num = "0" + nam;
                } else {
                    num = "" + nam;
                }
                accounts.deleteAccount(num);

                System.out.println("계좌가 삭제되었습니다.");
                continue;
            }
            // 3.입금
            if (menu == 3) {
                System.out.println("입금하실 계좌번호를 입력해 주세요.");
                String num;
                int nam = scanner.nextInt();
                scanner.nextLine();
                if (nam < 10) {
                    num = "00" + nam;
                } else if (nam < 100) {
                    num = "0" + nam;
                } else {
                    num = "" + nam;
                }
                System.out.println("입금할 금액을 입력하세요");
                int input = scanner.nextInt();
                scanner.nextLine();
                accounts.input(num, input);
                System.out.println("입금이 완료되었습니다.");
                continue;
            }
            // 4.출금
            if (menu == 4) {
                System.out.println("출금하실 계좌번호를 입력해 주세요.");
                String num;
                int nam = scanner.nextInt();
                scanner.nextLine();
                if (nam < 10) {
                    num = "00" + nam;
                } else if (nam < 100) {
                    num = "0" + nam;
                } else {
                    num = "" + nam;
                }
                System.out.println("출금할 금액을 입력하세요");
                int output = scanner.nextInt();
                scanner.nextLine();
                accounts.output(num, output);
                System.out.println("출금이 완료되었습니다.");
                continue;
            }
            // 5.계좌조회(개별)
            if (menu == 5) {
                System.out.println("조회하실 계좌번호를 입력해 주세요");
                String num;
                int nam = scanner.nextInt();
                scanner.nextLine();
                if (nam < 10) {
                    num = "00" + nam;
                } else if (nam < 100) {
                    num = "0" + nam;
                } else {
                    num = "" + nam;
                }
                accounts.each(num);
                continue;
            }
            // 6.계좌조회(전체)
            if (menu == 6) {
                System.out.println(accounts.toString());
                continue;
            }
            // 7.종료
            if (menu == 7) {
                stop = true;
            }
        }
    }

}
