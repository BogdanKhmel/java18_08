package com.khmel.java18_08.hwLesson9;

public class FizzBuzz {

    public static void main(String[] args) {
        int[] n = new int[15];
        for (int i = 0; i < n.length; i++) {
            n[i] = i + 1;

            if ((n[i] % 3 == 0) && (n[i] % 5 == 0))
                System.out.println("FizzBuzz");
            else if (n[i] % 3 == 0)
                System.out.println("Fizz");
            else if (n[i] % 5 == 0)
                System.out.println("Buzz");
        }

    }
}