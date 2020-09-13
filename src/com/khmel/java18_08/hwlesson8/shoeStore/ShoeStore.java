package com.khmel.java18_08.hwlesson8.shoeStore;

import com.khmel.java18_08.hwlesson8.shoeStore.people.Client;
import com.khmel.java18_08.hwlesson8.shoeStore.people.ServiceFactoryMetod;
import com.khmel.java18_08.hwlesson8.shoeStore.people.ServicesStaff;

public class ShoeStore {
    public static void main(String[] args) {
        Client client=new Client();
        ServiceFactoryMetod serviceFactory = new ServiceFactoryMetod();
        String choice = client.doSomething();
        WorkType work = getWork(choice);
        ServicesStaff servicesStaff = serviceFactory.service(work);
        System.out.println(servicesStaff.work(work));

    }
    private static WorkType getWork(String choice) {
        switch (choice) {
            case "Boots":
            case "Slippers":
            case "Sneakers":
                return WorkType.ISSUE_GOODS;

        }
        return null;
    }
}
