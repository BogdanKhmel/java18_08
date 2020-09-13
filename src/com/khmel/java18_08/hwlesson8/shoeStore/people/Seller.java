package com.khmel.java18_08.hwlesson8.shoeStore.people;

import com.khmel.java18_08.hwlesson8.shoeStore.WorkType;

public class Seller extends Person implements ServicesStaff{
    @Override
    public String doSomething() {
        return null;
    }

    @Override
    public String work(WorkType type) {
        return type.name();
    }
}
