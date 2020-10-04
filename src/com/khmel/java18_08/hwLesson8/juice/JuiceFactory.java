package com.khmel.java18_08.hwLesson8.juice;

public class JuiceFactory {
    public Juice cookJuice(JuiceType type) {
        Juice juice = null;
        switch (type) {
            case ORANGE_JUICE:
                return juice = new OrangeJuice();
            case CHERRY_JUICE:
                return juice = new CherryJuice();
            case TOMATO_JUICE:
                return juice = new TomatoJuice();
        }
        return null;
    }
}

