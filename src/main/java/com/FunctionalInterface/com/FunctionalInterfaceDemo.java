package com.FunctionalInterface.com;
interface  sayable{
    void say(String msg);
}
public class FunctionalInterfaceDemo implements sayable{
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceDemo functionalInterfaceDemo=new FunctionalInterfaceDemo();
        functionalInterfaceDemo.say("Hello there");
    }
}
