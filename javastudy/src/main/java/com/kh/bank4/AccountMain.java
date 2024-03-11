package com.kh.bank4;


import java.util.Scanner;

public class AccountMain {
    // 계좌 관리
    static final int ACCOUNTS_MAX_SIZE = 5;
    static Account[] accounts = new Account[ACCOUNTS_MAX_SIZE];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        Account account = null;
        String accountNumber = null;
        String accountName = null;
        int money = 0;
        int idx = -1;

        while (!stop) {
            System.out.println("1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료");
            System.out.print("선택 >> ");
            int menu = scanner.nextInt();
            scanner.nextLine();  // "\n"
            switch (menu) {
                case 1:  //신규
                    System.out.print("예금주명 : ");
                    accountName = scanner.nextLine();
                    account = new Account(accountName);
                    addAccount(account);
                    break;
                case 2:  //폐지
                    System.out.println("계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    closingAccount(accountNumber);
                    break;
                case 3:  //입금
                    System.out.print("계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    System.out.print("입금액 : ");
                    money = scanner.nextInt();
                    scanner.nextLine();
                    idx = findAccountIdx(accountNumber);
                    if(idx == -1) continue;
                    accounts[idx].deposit(money);
                    break;
                case 4:  //출금
                    System.out.print("계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    System.out.print("출금액 : ");
                    money = scanner.nextInt();
                    scanner.nextLine();
                    account.withdraw(money);
                    break;
                case 5:  //개별 조회
                    System.out.print("계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    scanner.nextLine();
                    getAccount(accountNumber);
                    break;
                case 6:  //전체 조회
                    listAccount();
                    break;
                case 7:  //종료
                    stop = true;
                    continue;
                default: //기타
                    System.out.println("(1~7) 선택바랍니다");
            }

        }
    }

    //계좌 추가
    private static void addAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                System.out.println("신규 계좌가 아래와 같이 생성되었습니다");
                System.out.println(account);
                return;
            }
        }
        System.out.println("계좌 개설 한도수(" + ACCOUNTS_MAX_SIZE + "개)를 초과하였습니다");
    }

    // 폐지
    public static void closingAccount(String accountNumber) {
        //계좌번호로 계좌인덱스 찾아오기
        int idx = findAccountIdx(accountNumber);
        //계좌를 못찾은 경우
        if(idx == -1) return;

        //잔액이 남아 있는 경우 폐지 불가능 하다.
        if (accounts[idx].getBalance() > 0) {
            System.out.println("잔액이 존재합니다");
            return;
        }

        //폐지 처리
        accounts[idx] = null;
        System.out.println("계좌가 폐지처리 되었습니다.");

    }

    // 계좌 찾기
    private static Account findAccount(String accountNumber) {
        Account account = null;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                account = accounts[i];
                return account;
            }
        }
        System.out.println("찾고자 하는 계좌가 없습니다");
        return account;
    }

    //계좌 인덱스 검색
    private static int findAccountIdx(String accountNumber) {
        int idx = -1;
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i] != null) {
                if (accounts[i].getAccountNumber().equals(accountNumber)) {
                    idx = i;
                    return idx;
                }
            }
        }

        System.out.println("찾고자하는 계좌가 없습니다.");
        return idx;
    }

    // 조회(개별)
    public static void getAccount(String accountNumber) {
        //계좌번호로 계좌 찾아오기
        Account account = findAccount(accountNumber);
        //계좌를 못찾은 경우
        if (account == null) return;
        System.out.print("계좌번호 : " + account.getAccountNumber());
        System.out.print("\t예금주 : " + account.getAccountName());
        System.out.print("\t잔액 : " + account.getBalance());

    }

    // 조회(전체)
    public static void listAccount() {
        int usingAccount = 0;   //사용중인 계좌
        for (Account account : accounts) {
            if (account == null) continue;
            usingAccount++;
            System.out.print("계좌번호 : " + account.getAccountNumber());
            System.out.print("\t예금주 : " + account.getAccountName());
            System.out.print("\t잔액 : " + account.getBalance());
            System.out.println();
        }
        System.out.print("\t사용중인 계좌수 : " + usingAccount);
        System.out.print("\t잔여계좌수 : " + (ACCOUNTS_MAX_SIZE - usingAccount));
        System.out.println();
    }

}
