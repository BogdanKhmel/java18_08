package com.khmel.java18_08.HomeTest;

/**
 * Created by ффлсутжд on 24.08.20.
 */

import java.util.Scanner;

public class Numbers3 {
    public static void main(String[] args) {
        double x;
        Scanner c = new Scanner(System.in);
        System.out.println("Введите число");
        x = c.nextDouble();
        if (x % 1 == 0) System.out.println("Вы ввели целое число");
        else System.out.println("Вы ввели не целое число");

    }
}