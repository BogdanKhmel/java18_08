package com.khmel.java18_08.hwLesson8.juice;

public class OrangeJuice implements Juice {

    @Override
    public void makeJuice() {
        System.out.println("Make orange juice");
    }

    @Override
    public void giveClient() {
        System.out.println("Give to client");
    }
}
