package com.Lambda.com.Lambda1.com;
interface GenericInterface<T>{
    T func(T t);
}
public class Lamb2 {
    public static void main(String[] args) {
        GenericInterface<String>reverse=new GenericInterface<String>() {
            @Override
            public String func(String s) {
                return null;
            }
        };
        System.out.println("Lambda reverse="+reverse.func("Lambda"));
        GenericInterface<Integer>factorial=(n)->{
        int result=1;
        for (int i=1;i<=n;i++)
            result*=i;
        return result;
        };
        System.out.println("Factorial of 5="+factorial.func(5));
    }
}
