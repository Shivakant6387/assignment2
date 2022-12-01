package com.Lambda.com.Lambda1.com.FunctionalInterface.com;
public class Func {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("new thread created");
        }).start();

    }
}
