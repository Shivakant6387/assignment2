package com.SmartPhone.com;

public interface SmartPhone {
    void keyword();
    void Ringtone();

    default void call(){
        System.out.println("pickup call");
    }
}
