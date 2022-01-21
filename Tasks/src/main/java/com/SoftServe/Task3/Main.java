package com.SoftServe.Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of 1st array: ");
        int[] arr1 = {scanner.nextInt(), scanner.nextInt()};
        System.out.println("Enter size of 2st array: ");
        int[] arr2 = {scanner.nextInt(), scanner.nextInt()};
        if (arr1[0] == arr2[0] && arr1[1] == arr2[1]) {
            int[][] array1;
            int[][] array2;
            array1 = (int[][]) main.CreateArray(arr1);
            array2 = (int[][]) main.CreateArray(arr2);
            System.out.println("1st array:");
            main.PrintArrays(array1);
            System.out.println("2nd array: ");
            main.PrintArrays(array2);
            com.SoftServe.Task3.Arrays arrays = new com.SoftServe.Task3.Arrays();
            arrays.ArrayComparison(array1, array2);
        } else System.out.println("Arrays are different!!!");
    }

    private Object CreateArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[arr[0]][arr[1]];
        for (int i = 0; i < arr[0]; i++) {
            for (int j = 0; j < arr[1]; j++) {
                System.out.println("Enter " + i + "." + +j + " element of array: ");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    private void PrintArrays(int[][] array) {
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
