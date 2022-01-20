package com.SoftServe.Task1;

class Number {
    private int n;

    Number(int n) {
        this.n = n;
    }

    private int[] SplitNumber() {
        int[] arrayOfNumbers = new int[3];
        int num = n;
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            arrayOfNumbers[i] = num % 10;
            num = num / 10;
        }
        return arrayOfNumbers;
    }

    public void PitCheck() {
        int[] arrayOfNumbers = SplitNumber();
        if (arrayOfNumbers[0] > arrayOfNumbers[1] && arrayOfNumbers[2] > arrayOfNumbers[1]) {
            System.out.println("This number is a gap!");
        } else System.out.println("This number isn't a gap!");
    }
}
