package com.Lambda.com.Lambda1.com.FunctionalInterface.com.Runnable;

public class Runn {
    public static void main(String[] args) {
        System.out.println("main thread is  "+Thread.currentThread().getName());
        Thread thread= new Thread(new Runn().new RunnableImp());
        thread.start();
    }
    private class   RunnableImp implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName()+", executing run () method");
        }
    }
}
