package com.company.professions;

import com.company.Person;

public class Driver extends Person {
    private double driveExperience;


    public Driver(String fullname,double driveExperience){
        super(fullname);
        this.driveExperience = driveExperience;
    }

    public  String getDriver(){
        String driverInfo = getFullname() + " " + driveExperience;
        return driverInfo;
    }


    }

