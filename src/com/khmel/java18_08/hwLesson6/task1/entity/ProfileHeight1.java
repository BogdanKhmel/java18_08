package com.khmel.java18_08.hwLesson6.task1.entity;

public class ProfileHeight1 extends ProfileHeight {
    private String s;
    private String season;

    public ProfileHeight1(int profileWidth, int profile, String season) {
        super(profileWidth, profile);
        this.season = season;
    }



    public String getS() {

        if(getProfile()<=50)
            s =season+" Высокопрофильная шина";
        else
            s =season+" Hизкопрофильная шина";

        return s;
    }

    }
