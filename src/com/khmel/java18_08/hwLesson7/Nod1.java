package com.khmel.java18_08.hwLesson7;

public class Nod1 {
    public static long nod(long a, long b) {


        if (b == 0)
            return a;
        else
            return nod(b, a % b);

    }

    public static void main(String[] args) {
        System.out.println(nod(7, 21));
    }
}
