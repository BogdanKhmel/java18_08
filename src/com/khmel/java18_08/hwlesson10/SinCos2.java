package com.khmel.java18_08.hwlesson10;

import java.util.Scanner;
public class SinCos2 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("please enter the angle in degrees");
        String s = a.nextLine();
        Double d = Double.parseDouble(s);
        System.out.printf("angle %2s degrees sin %.2f cos %.2f ",s,Math.sin(Math.toRadians(d)),Math.cos(Math.toRadians(d)));
    }
}
