package com.company.professions;

public class Driver {
    private String fullname;
    private double driveExperience;


    public Driver(String fullname,double driveExperience){

        this.fullname = fullname;
        this.driveExperience = driveExperience;
    }

    public  String getDriver(){
        String driverInfo = fullname + " " + driveExperience;
        return driverInfo;
    }


    }

