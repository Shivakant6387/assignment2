package com.SmartPhone.com;

public class Touch implements SmartPhone{

    @Override
    public void keyword() {
        System.out.println("key");
    }

    @Override
    public void Ringtone() {
        System.out.println("Ringing");
    }
}
