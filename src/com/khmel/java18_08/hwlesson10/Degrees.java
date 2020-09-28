package com.khmel.java18_08.hwlesson10;

import java.util.Scanner;

public class Degrees {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter length of first leg");
        double leg1 = s.nextDouble();
        System.out.println("Please enter length of second leg");
        double leg2 = s.nextDouble();
        int angel1 = (int)Math.round(Math.toDegrees(Math.atan(leg1/leg2)));
        int angel2 = Math.round(90 - angel1);

        System.out.println("The angles of a right triangle are 90, "+angel1+", "+angel2+" degrees");

    }
}
