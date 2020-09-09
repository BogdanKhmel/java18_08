package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lory;
import com.company.vehicles.SportCar;

public class executor {


    public static void main(String[] args) {
        Driver driver1 = new Driver("Иванов Иван Иванович",35);
        Engine engine1 = new Engine(250,"Мерседес");
        Car car = new Car("Мерседес s600", "Седан", 2,driver1,engine1);
        car.printInfo();
        Driver driver2 = new Driver("Сидоров Иван Петрович",20);
        Engine engine2 = new Engine(520,"MAN");
        Lory lory = new Lory("MAN","Грузовик",5,driver2,engine2,20);
        lory.printInfo();
        Driver driver3 = new Driver("Петров Иван Петрович",10);
        Engine engine3 = new Engine(750,"Ferrari");
        SportCar sportCar = new SportCar("Ferrari","Спорткар",1,driver3,engine3,430);
        sportCar.printInfo();

    }
}