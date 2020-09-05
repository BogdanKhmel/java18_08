package com.khmel.java18_08.HomeTest;

/**
 * Created by ффлсутжд on 25.08.20.
 */
import java.util.Scanner;
public class TabMult {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Введите число");
        int x = c.nextInt();
        for(int i=1; i<=10; i++)
        System.out.println(x + " * " + i + " = "+ x*i );

    }
}
