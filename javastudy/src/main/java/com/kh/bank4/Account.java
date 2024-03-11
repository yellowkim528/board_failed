package com.kh.bank4;

public class Account {


    // 예금주, 잔고, 계좌번호
    private String accountName;                    // 예금주
    private int balance;                           // 잔고
    private String accountNumber;
    private static int accountNum;                 // 계좌번호 카운트
    private static final int ACCOUNT_NUM_SIZE = 3; // 계좌번호 자리수

    public Account(String accountName) {
        // 계좌 오픈
        this.accountName = accountName;
        accountNumber = makeAccountNumber(++accountNum);
        // 계좌 추가
    }

    // 계좌번호 생성
    private String makeAccountNumber(int accountNum) {
        String str = "" + accountNum;
        int cnt = ACCOUNT_NUM_SIZE - str.length();
        for (int i = 0; i < cnt; i++) {
            str = "0" + str;
        }
        return str;
    }

    // 입금
    public void deposit(int money) {
        // 1회 입금한도는 4만원을 초과할 수 없다.
        if (money > 40_000) {
            System.out.println("1회 입금한도는 4만원을 초과할 수 없다");
            return;
        }
        // 예치금액은 10만원 이하로 제한 한다.
        if (balance + money > 100_000) {
            System.out.println("예치금액은 10만원 이하로 제한 한다");
            return;
        }

        //입금처리
        balance += money;
        System.out.println(this);
    }


    // 출금
    public void withdraw(int money) {
        // 1회 출금한도는 4만원을 초과할 수 없다.
        if (money > 40_000) {
            System.out.println("1회 입금한도는 4만원을 초과할 수 없다");
            return;
        }
        if (balance < money) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        // 출금처리
        balance -= money;
        System.out.println(this);
    }




    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "예금주 : " + accountName +
                "\t 계좌번호 : " + accountNumber +
                "\t 잔액 : " + balance + "\n";

    }
}
