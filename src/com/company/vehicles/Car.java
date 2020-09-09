package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import static java.lang.System.*;

public  class Car {
    private String carMake;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String carMake, String carClass, double weight, Driver driver,Engine engine) {

        this.carMake = carMake;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;


    }


    public String  getCar() {
        String carInfo = carMake+" "+carClass+" "+weight;
       return carInfo;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }



    public  void printInfo() {

       System.out.println("   "+getCar() + "\n" + driver.getDriver() + "\n" + engine.getEngine());

    }
}