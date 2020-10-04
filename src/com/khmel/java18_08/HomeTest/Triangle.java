package com.khmel.java18_08.HomeTest;

/**
 * Created by ффлсутжд on 30.08.20.
 */
public class Triangle {
    public static void main(String[] args) {
        int cat1 = 15;
        int cat2 = 10;
        double s = (cat1 * cat2) / 2;
        double a = Math.abs(cat1);
        double b = Math.abs(cat2);
        double c = Math.sqrt(Math.pow(a, 2)) + Math.sqrt(Math.pow(b, 2));
        double p = a + b + c;
        System.out.println("Площадь равна " + s);
        System.out.println("Гипотенуза равна " + c);
        System.out.println("Периметр равен " + p);
    }
}