package com.example.delivery.model;

public enum DeliveryMode {
    PREMIUM("premium"),
    REGULAR("regular");

    public final String value;

    DeliveryMode(String value){
        this.value = value;
    }
}
