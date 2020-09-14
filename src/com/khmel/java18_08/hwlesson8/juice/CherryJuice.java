package com.khmel.java18_08.hwlesson8.juice;

public class CherryJuice implements Juice{
    @Override
    public void makeJuice() {
       System.out.println("Make cherry juice");
        
    }

    @Override
    public void giveClient() {
        System.out.println("Give to client");
    }
}
