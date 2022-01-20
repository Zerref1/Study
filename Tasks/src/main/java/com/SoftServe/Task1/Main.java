package com.SoftServe.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Insert the number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Number number = new Number(num);
        number.PitCheck();
    }
}