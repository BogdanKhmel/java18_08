package com.khmel.java18_08.HomeTest;

/**
 * Created by ффлсутжд on 25.08.20.
 */
import java.util.Scanner;
public class Spd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите расстояние до места назначения (N) и время (Т)");
        int N = s.nextInt();
        int T = s.nextInt();
        System.out.println("Скорость равна "+(N/T));
    }
}
