package com.SoftServe.Task2;

public class Number {
    private int n1, n2;

    Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void ThatMore() {
        int difference;
        if (n1 > n2) {
            for (int i = n2 + 1; i <= n1 + n2; i++) {
                System.out.println(i);
            }
        } else if (n2 > n1) {
            for (int i = n1 + 1; i <= n1 + n2; i++) {
                System.out.println(i);
            }
        } else System.out.println("1st number == 2nd number!!!");
    }
}
