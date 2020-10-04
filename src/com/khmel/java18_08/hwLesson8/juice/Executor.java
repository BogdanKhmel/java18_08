package com.khmel.java18_08.hwLesson8.juice;

import java.util.Scanner;

public class Executor {
    public static void main(String[] ags) {
        JuiceFactory juiceFactory = new JuiceFactory();
        FreshBar freshBar = new FreshBar(juiceFactory);
        Scanner s = new Scanner(System.in);
        System.out.println("What juice you will drink? Orange juice, Cherry juice or Tomato juice?");
        String choice = s.nextLine();
        JuiceType juice = getJuice(choice);
        freshBar.orderJuice(juice);


    }

    private static JuiceType getJuice(String choice) {
        switch (choice) {
            case "Orange juice":
                return JuiceType.ORANGE_JUICE;
            case "Cherry juice":
                return JuiceType.CHERRY_JUICE;
            case "Tomato juice":
                return JuiceType.TOMATO_JUICE;

        }
        return null;
    }
}
