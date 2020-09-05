package com.khmel.java18_08.HomeTest;

/**
 * Created by ффлсутжд on 23.08.20.
 */
public class TestVar4 {
    public static void main(String[] args) {
        int n = 354;
        int a = n/100;
        int b = ((n-(a*100))/10);
        int c = (n-(a*100)-(b*10));

        System.out.println("Сумма цифр числа " + n +" равна " + (a+b+c));
    }

}
