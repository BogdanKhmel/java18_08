package com.khmel.java18_08.hwLesson6.task1;

import com.khmel.java18_08.hwLesson6.task1.entity.*;

public class Executor {
    public static void main(String[] args) {

        ProfileHeight a = new ProfileHeight(205, 55);
        ProfileHeight1 b = new ProfileHeight1(205, 55, "Зимняя");
        InDiameterTire c = new InDiameterTire(205, 55, "R", 16);
        OuterDiameter d = new OuterDiameter(205, 55, "R", 16);

        System.out.println(a.getProfileHeight());
        System.out.println(b.getS());
        System.out.println(c.getInDiameterTire());
        System.out.println(d.getOutDiameter());
    }
}
