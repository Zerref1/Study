package com.SoftServe.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Insert the number: ");
        Number number = new Number();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        number.PitCheck(number.SplitNumber(number.GetNumber(num)));
    }
}