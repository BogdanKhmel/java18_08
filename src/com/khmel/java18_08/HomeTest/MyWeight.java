package com.khmel.java18_08.HomeTest;

/**
 * Created by ффлсутжд on 24.08.20.
 */
public class MyWeight {
    public static void main(String[] args) {
        System.out.println(getWeight(50));
    }

    public static double getWeight(double earthWeight) {
        double moonWeight = earthWeight * 0.17;
        return moonWeight;
    }
}

