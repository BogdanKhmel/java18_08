package com.khmel.java18_08.HomeTest;

/**
 * Created by ффлсутжд on 24.08.20.
 */
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        int x,y;
        Scanner c = new Scanner(System.in);
        do {
            System.out.println("Введите два не равных друг другу числа х и у");
            x = c.nextInt();
            y = c.nextInt();
            if (x == y) System.out.println("Вы ввели равные числа");
        }
            while (x==y);

        if (x > y)System.out.println("Большее из них х = " + x);
        else
            System.out.println("Большее из них у = " + y);


    }
}
