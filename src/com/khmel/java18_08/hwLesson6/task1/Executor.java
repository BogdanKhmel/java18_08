package com.khmel.java18_08.hwLesson6.task1;

import com.khmel.java18_08.hwLesson6.task1.entity.*;

public class Executor {
    public static void main(String[] args){
        Animal name = new Butterfly();
        name.move();
        name = new Sparrow();
        name.move();
       Snake dan = new Cobra();
        dan.move();
        dan.zt();
        dan.danger = "Укус";
        System.out.println(dan.danger);

    }
}
