package com.khmel.java18_08.hwLesson6.task1.entity;

// внутренний диаметр в мм.

public class InDiameterTire extends ProfileHeight {
    private String type;
    private int diameter;
    private double inDiameter;

    public InDiameterTire(int profileWidth, int profile, String type, int diameter) {
        super(profileWidth, profile);
        this.type = type;
        this.diameter = diameter;
    }


    public String getType() {
        return type;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getInDiameterTire(){
        return inDiameter = diameter*25.4;




    }

}
