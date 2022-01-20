package com.SoftServe.Task1;

import java.util.Scanner;

public class Number {
    public int GetNumber(int n){
        int num = n;
        return num;
    }
    public int[] SplitNumber(int n){
        int [] arrayOfNumbers = new int[3];
        int num = n;
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            arrayOfNumbers[i] = num % 10;
            num = num / 10;
        }
        return arrayOfNumbers;
    }
    public void PitCheck(int n[]){
        int[] arrayOfNumbers = n;
        if(arrayOfNumbers[0]>arrayOfNumbers[1]&&arrayOfNumbers[2]>arrayOfNumbers[1]){
            System.out.println("This number is a gap!");
        }else System.out.println("This number isn't a gap!");
    }
    }
