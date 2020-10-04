package com.khmel.java18_08.hwLesson10;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write a line");
        String a = s.nextLine();
        if (a.equals((new StringBuffer(a)).reverse().toString()))
            System.out.print("Palindrome");
        else
            System.out.print("Not palindrome");
    }
}