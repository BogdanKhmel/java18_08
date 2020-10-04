package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String carMake, String carClass, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(carMake, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(maxSpeed);


    }
}
