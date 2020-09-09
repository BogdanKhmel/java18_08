package com.company.details;

public class Engine {
     private double power;
    private String manufacturer;

    public Engine(double power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }
public String getEngine(){
        String engineInfo = power + " " + manufacturer;
        return engineInfo;
}



}
