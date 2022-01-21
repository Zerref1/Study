package com.SoftServe.Task3;

public class Arrays {
    public void ArrayComparison(int[][] arr1, int[][] arr2) {

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] == arr2[i][j]) {

                } else {
                    System.out.println("Arrays are different!!!");
                    break;
                }
            }
        }
    }
}

