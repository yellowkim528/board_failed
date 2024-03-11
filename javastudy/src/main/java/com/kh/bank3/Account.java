package com.kh.bank3;

public class Account {
    // 계좌 관리
    private static final int ACCOUNTS_MAX_SIZE = 5;
    private static Account[] accounts = new Account[ACCOUNTS_MAX_SIZE];


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
        addAccount();
    }

    private void addAccount() {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = this;
                System.out.println("신규 계좌가 아래와 같이 생성되었습니다");
                System.out.println(this);
                return;
            }
        }
        System.out.println("계좌 개설 한도수(" + ACCOUNTS_MAX_SIZE + "개)를 초과하였습니다");
    }

    // 계좌번호 생성기
    private String makeAccountNumber(int accountNum) {
        String str = "" + accountNum;
        int cnt = ACCOUNT_NUM_SIZE - str.length();
        for (int i = 0; i < cnt; i++) {
            str = "0" + str;
        }
        return str;
    }

    // 입금
    public void deposit(String accountNumber, int money) {
        // 1회 입금한도는 4만원을 초과할 수 없다.
        if (money > 40_000) {
            System.out.println("1회 입금한도는 4만원을 초과할 수 없다");
            return;
        }
        //계좌번호로 계좌 찾아오기
        Account account = findAccount(accountNumber);
        //계좌를 못찾은 경우
        if (account == null) return;


        // 예치금액은 10만원 이하로 제한 한다.
        if (account.balance + money > 100_000) {
            System.out.println("예치금액은 10만원 이하로 제한 한다");
            return;
        }

        //입금처리
        account.balance += money;
        System.out.println(account);
    }

    // 폐지
    public void closingAccount(String accountNumber) {
        //계좌번호로 계좌 인덱스 찾아오기
        int idx = findAccountIdx(accountNumber);
        //계좌를 못찾은 경우
        if(idx == -1) return;

        //잔액이 남아 있는 경우 폐지 불가능 하다.
        if (accounts[idx].balance > 0) {
            System.out.println("잔액이 존재합니다");
            return;
        }

        //폐지 처리
        accounts[idx] = null;
        System.out.println("계좌가 폐지처리 되었습니다.");

    }

    // 출금
    public void withdraw(String accountNumber, int money) {
        // 1회 출금한도는 4만원을 초과할 수 없다.
        if (money > 40_000) {
            System.out.println("1회 입금한도는 4만원을 초과할 수 없다");
            return;
        }
        //계좌번호로 계좌 찾아오기
        Account account = findAccount(accountNumber);
        //계좌를 못찾은 경우
        if (account == null) return;

        if (account.balance < money) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        // 출금처리
        account.balance -= money;
        System.out.println(account);
    }

    // 조회(개별)
    public void getAccount(String accountNumber) {
        //계좌번호로 계좌 찾아오기
        Account account = findAccount(accountNumber);
        //계좌를 못찾은 경우
        if (account == null) return;
        System.out.print("계좌번호 : " + account.accountNumber);
        System.out.print("\t예금주 : " + account.accountName);
        System.out.print("\t잔액 : " + account.balance);

    }

    // 조회(전체)
    public void listAccount() {
        int usingAccount = 0;   //사용중인 계좌
        for (Account account : accounts) {
            if (account == null) continue;
            usingAccount++;
            System.out.print("계좌번호 : " + accountNumber);
            System.out.print("\t예금주 : " + accountName);
            System.out.print("\t잔액 : " + balance);
            System.out.println();
        }
        System.out.print("\t사용중인 계좌수 : " + usingAccount);
        System.out.print("\t잔여계좌수 : " + (ACCOUNTS_MAX_SIZE - usingAccount));
        System.out.println();
    }


    // 계좌 찾기
    private Account findAccount(String accountNumber) {
        Account account = null;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountNumber.equals(accountNumber)) {
                account = accounts[i];
                return account;
            }
        }
        System.out.println("찾고자 하는 계좌가 없습니다");
        return account;
    }

    private int findAccountIdx(String accountNumber) {
        int idx = -1;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                if (accounts[i].accountNumber.equals(accountNumber)) {
                    idx = i;
                    return idx;
                }
            }
        }
        System.out.println("찾고자 하는 계좌가 없습니다");
        return idx;
    }

    @Override
    public String toString() {
        return "예금주 : " + accountName +
                "\t 계좌번호 : " + accountNumber +
                "\t 잔액 : " + balance + "\n";

    }
}
