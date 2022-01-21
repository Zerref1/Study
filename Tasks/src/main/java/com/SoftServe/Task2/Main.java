package com.SoftServe.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insert the first number: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Insert the first number: ");
        int num2 = scanner.nextInt();
        Number number = new Number(num1,num2);
        number.ThatMore();
    }
}
