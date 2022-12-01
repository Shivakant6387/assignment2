package com.Lambda.com.Lambda1.com.FunctionalInterface.com.Runnable;

import java.io.FileNotFoundException;
import java.nio.channels.FileLockInterruptionException;

public class Runn2 {
    public static void main(String[] args) {
        System.out.println("Main thread is "+Thread.currentThread().getName());
        Thread threads=new Thread(new Runn2().new RunnableImp());
        threads.start();
    }
    private class RunnableImp implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName()+",executing run() method!");
            try{
                throw new FileNotFoundException();
            }catch (FileNotFoundException e){
                System.out.println("Must catch here!");
                e.printStackTrace();
            }
            int r=1/0;
        }
    }
}
