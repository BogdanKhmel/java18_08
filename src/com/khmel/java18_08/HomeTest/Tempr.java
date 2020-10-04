package com.khmel.java18_08.HomeTest;

/**
 * Created by ффлсутжд on 30.08.20.
 */
public class Tempr {
    public static void main(String[] args) {
        System.out.println("Температора в Градусах Фаренгейта равна " + Tempr(25));
    }

    public static double Tempr(int tc) {
        return 9 / 5.0 * tc + 32;

    }

}
