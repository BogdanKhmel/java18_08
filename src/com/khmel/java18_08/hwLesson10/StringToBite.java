package com.khmel.java18_08.hwLesson10;


import java.io.UnsupportedEncodingException;

public class StringToBite {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "String to bite";
        byte b[] = s.getBytes("ASCII");
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);
        String string = new String(b);
        System.out.println(string);

    }
}