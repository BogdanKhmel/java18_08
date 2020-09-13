package com.khmel.java18_08.hwlesson8.shoeStore;

public enum WorkType {
    SELL("Selling"),
    ISSUE_GOODS("Issuing good"),
    ACCEPT_GOODS("Accepting good"),
    GET_PAID("Getting paid");

    private String message;

    WorkType(String message){
        this.message= message;
    }


}
