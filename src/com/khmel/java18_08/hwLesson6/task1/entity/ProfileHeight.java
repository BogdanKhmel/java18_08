package com.khmel.java18_08.hwLesson6.task1.entity;

// расчёт высоты профиля шины в мм.

public class ProfileHeight {

    private int profileWidth;
    private int profile;
    private double profileHeight;

    public ProfileHeight(int profileWidth, int profile) {
        this.profileWidth = profileWidth;
        this.profile = profile;

    }


    public int getProfileWidth() {
        return profileWidth;
    }

    public int getProfile() {
        return profile;
    }
    

   public double getProfileHeight() {
       return profileHeight= profileWidth * profile  / 100;

    }
}
