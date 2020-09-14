package com.khmel.java18_08.hwlesson8.shoeStore.people;

import com.khmel.java18_08.hwlesson8.shoeStore.WorkType;

public class ServiceFactoryMetod {
    public  ServicesStaff service(WorkType type){
        ServicesStaff servicesStaff =null;
        switch (type){
            case SELL:
                return new Seller();
                
            case ACCEPT_GOODS:
            case ISSUE_GOODS:
               return new Storekeeper();
               
            case GET_PAID:
                return new Cashier();
                

        }
        return  null;

    }
}
