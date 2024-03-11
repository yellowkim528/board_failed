package com.kh.bank;

public class Human {
    private String name;
    private int balance;
    private String accountNum;
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;

    public Human(String name, int balance, String accountNum) {
        this.name = name;
        this.balance = balance;
        this.accountNum = accountNum;
    }

    //계좌번호 생성기
    public String genNum() {
        String account;

        if (num3 == 9) {
            if (num2 == 9) {
                num1++;
                num2=0;
                num3=0;
            }
            num3 = 0;
            num2++;
        }
        num3++;
        account = "" + num1 + num2 + num3;
        return account;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", accountNum='" + accountNum + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }
}
