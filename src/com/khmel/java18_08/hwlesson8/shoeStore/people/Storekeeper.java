package com.khmel.java18_08.hwlesson8.shoeStore.people;

import com.khmel.java18_08.hwlesson8.shoeStore.WorkType;

//кладовщик
public class Storekeeper extends Person implements  ServicesStaff{

    @Override
    public String doSomething() {
        System.out.println("Работает на склоде");
    }
    @Override
    public String work(WorkType type) {
        return type.name();
    }


}
