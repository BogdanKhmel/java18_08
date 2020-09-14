package com.khmel.java18_08.hwlesson8.juice;

public class FreshBar {
private JuiceFactory juiceFactory;
    public FreshBar(JuiceFactory juiceFactory){
        this.juiceFactory=juiceFactory;
    }


    public Juice orderJuice(JuiceType type) {
      Juice juice = juiceFactory.cookJuice(type);
            juice.makeJuice();
       juice.giveClient();
       System.out.println("You juice please");
        return juice;
    }
}
