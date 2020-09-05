package com.khmel.java18_08.HomeTest;

/**
 * Created by ффлсутжд on 29.08.20.
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class ChangeMoney {

    public static double CnMon(double g, double r) {
        return g/r;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество гривен и курс");
        double uah = s.nextDouble();
        double course = s.nextDouble();
        double y = CnMon(uah, course);
        DecimalFormat f = new DecimalFormat("#.##");
        String n = f.format(y);
        System.out.println("Колличество долларов равно "+n);
    }

    }

