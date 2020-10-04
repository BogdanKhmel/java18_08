package com.khmel.java18_08.hwLesson10;

import java.util.Scanner;

public class DellChar {
    public static String dellChar(String a, String e) {
        String g = a.replaceAll(e, "");
        return g;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write a line");
        String a = s.nextLine();
        System.out.println("Write the character");
        String e = s.nextLine();
        System.out.println("delete the given character: " + dellChar(a, e));
    }
}