package com.khmel.java18_08.hwlesson8.shoeStore.people;

public  abstract class  Person {
    private String name;
    private int age;
    private String position;

    public abstract String doSomething();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}

