package com.khmel.java18_08.HomeTest;

/**
 * Created by ффлсутжд on 24.08.20.
 */
import java.util.Scanner;
public class Numbers2 {
    public static void main(String[] args) {
        int x;
        Scanner c = new Scanner(System.in);
        do {
            System.out.println("Введите  число x");
            x = c.nextInt();
            if (x == 0) System.out.println("Вы ввели число равное 0");
        }
        while (x == 0);
        if (x % 2 == 0) System.out.println("Вы ввели чётное число");
        else
            System.out.println("Вы ввели не чётное число");
    }
}
