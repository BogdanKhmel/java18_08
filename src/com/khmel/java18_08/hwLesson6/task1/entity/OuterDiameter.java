package com.khmel.java18_08.hwLesson6.task1.entity;

//Внешний диаметр
public class OuterDiameter extends InDiameterTire {

    private double outDiameter;

    public OuterDiameter(int profileWidth, int profile, String type, int diameter) {
        super(profileWidth, profile, type, diameter);
    }


    public double getOutDiameter() {

        return outDiameter = getProfileHeight() * 2 + getInDiameterTire();
    }
}