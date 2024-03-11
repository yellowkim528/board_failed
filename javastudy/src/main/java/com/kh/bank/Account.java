package com.kh.bank;

import java.util.Arrays;

public class Account {
    private String[] name;        // 예금주
    private int[] balance;        // 잔고
    private String[] accountNum;  // 계좌번호 num1_num2_num3
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int cnt = 0;

    public Account() {
        int capacity = 5;       // 최대 5개
        this.name = new String[capacity];
        this.accountNum = new String[capacity];
        this.balance = new int[capacity];
    }

    // 계좌 추가
    public void addAccount(String name) {
        for (int i = 0; i < 5; i++) {
            if (name.equals(this.name[i])) {
                System.out.println("동일한 이름이 존재합니다.");
                return;
            }
        }
        this.name[cnt] = name;
        this.balance[cnt] = 0;
        accountNum[cnt] = genNum();
        cnt++;
    }

    // 계좌 삭제
    public void deleteAccount(String num) {
        int a = -1;
        for (int i = 0; i < 5; i++) {
            if (this.accountNum[i].equals(num)) {
                a = i;
                break; // 삭제할 계좌를 찾았으면 더 이상 반복할 필요가 없으므로 반복문을 종료합니다.
            }
        }

        // 삭제할 계좌를 찾지 못했을 경우
        if (a == -1) {
            System.out.println("일치하는 계좌가 없습니다");
            return;
        }

        // 찾은 계좌를 배열에서 삭제
        for (int i = a; i < cnt - 1; i++) {
            accountNum[i] = accountNum[i + 1];
            name[i] = name[i + 1];
            balance[i] = balance[i + 1];
        }

        // 배열의 마지막 요소 초기화
        accountNum[cnt - 1] = null;
        name[cnt - 1] = null;
        balance[cnt - 1] = 0;
        cnt--;

    }

    // 입금
    public void input(String num, int money) {
        for (int i = 0; i < 5; i++) {
            if (this.accountNum[i].equals(num)) {
                balance[i] += money;
                return;
            }
        }
    }

    // 출금
    public void output(String num, int money) {
        for (int i = 0; i < 5; i++) {
            if (this.accountNum[i].equals(num)) {
                balance[i] -= money;
                if (balance[i] < money) {
                    System.out.println("잔고가 부족합니다");
                    return;
                }
                return;
            }
        }
    }

    // 개별 조회
    public void each(String num) {
        String str = "";
        for (int i = 0; i < 5; i++) {
            if (this.accountNum[i].equals(num)) {
                str += "-----------" + (i + 1) + "번 계좌-------------" + "\n";
                str += "예금주 : " + name[i] + "\n";
                str += "잔액 : " + balance[i] + "\n";
                System.out.println(str);
                return;
            }
        }


    }

    // 전체 조회
    @Override
    public String toString() {
        String str = "";
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (name[i] == null) {
                break;
            }
            str += "-----------" + (i + 1) + "번 계좌-------------" + "\n";
            str += "예금주 : " + name[i] + "\n";
            str += "계좌번호 : " + accountNum[i] + "\n";
            str += "잔액 : " + balance[i] + "\n";
        }
        for (int i = 0; i < 5; i++) {
            if (name[i] == null) {
                count++;
            }
        }
        str += "------------------------------------" + "\n";
        str += "사용중인 계좌수 : " + (5-count) + "\n";;
        str += "잔여계좌수 : " + count + "\n";;
        return str;
    }

    // 계좌번호 생성기
    public String genNum() {
        String account;

        if (num3 == 9) {
            if (num2 == 9) {
                num1++;
                num2 = 0;
                num3 = 0;
            }
            num3 = 0;
            num2++;
        }
        num3++;
        account = "" + num1 + num2 + num3;
        return account;
    }


    public String[] getName() {
        return name;
    }

    public int[] getBalance() {
        return balance;
    }

    public String[] getAccountNum() {
        return accountNum;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public void setBalance(int[] balance) {
        this.balance = balance;
    }

    public void setAccountNum(String[] accountNum) {
        this.accountNum = accountNum;
    }
}
