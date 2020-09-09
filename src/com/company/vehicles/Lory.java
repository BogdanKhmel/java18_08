package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lory extends Car{
    private int carrying;
    public Lory(String carMake, String carClass, double weight, Driver driver, Engine engine, int carrying) {
        super(carMake, carClass, weight, driver, engine);
        this.carrying = carrying;
                }
        public void printInfo(){
            super.printInfo();
            System.out.println(carrying);

        }
    }
