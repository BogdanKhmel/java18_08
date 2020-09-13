package com.khmel.java18_08.hwlesson8.shoeStore.people;

import com.khmel.java18_08.hwlesson8.shoeStore.things.Boots;
import com.khmel.java18_08.hwlesson8.shoeStore.things.Shoe;
import com.khmel.java18_08.hwlesson8.shoeStore.things.Slippers;
import com.khmel.java18_08.hwlesson8.shoeStore.things.Sneakers;

import java.util.Random;

public class Client extends  Person{

    @Override
    public String doSomething() {
        return makeChoice(getShoe());
    }
    public String makeChoice(Shoe shoe){
        return shoe.getName();
    }
    private Shoe getShoe(){
        Shoe shoe = null;
        int random = new Random().nextInt();
        if (random % 2 == 0){
            shoe =new Boots();
        }
           else if (random % 3 == 0){
               shoe = new Slippers();
           } else {
               shoe =new Sneakers();
        }

        return shoe;
    }
}
