package com.Lambda.com;

public abstract class TwoVehicle implements vehicle {
    void tyre(){
        System.out.println("Only allow bike");
    }
    public void fuel(){
        System.out.println("Added fuel");
    }
    public void speedUp(){
        System.out.println("Added speed");
    }
    public void mirror(){
        System.out.println("Add mirror");
    }
    public void gar(){
        System.out.println("Add gar");
    }

}
