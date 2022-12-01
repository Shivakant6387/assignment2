package com.Lambda.com;

//public class FourVihicle implements vehicle {
class FourVehicle extends TwoVehicle{

    @Override
    public void fuel() {
        System.out.println("implement fuel ");
    }

    @Override
    public void gar() {
        System.out.println("implement gar");
    }

    @Override
    public void mirror() {
        System.out.println("implement mirror");
    }

    @Override
    public void speedUp() {
        System.out.println("implement speedup");
    }
}
