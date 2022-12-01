package com.Lambda.com.Lambda1.com;
interface MyInterface2{
    String reverse(String n);
}
public class Lamb {
    public static void main(String[] args) {
        MyInterface2 myInterface2=(str)->{
            String result="";
            for (int i=str.length()-1;i>=0;i--)
                result+=str.charAt(i);
            return result;
        };
        System.out.println("Lambda reversed="+myInterface2.reverse("Lambda"));
    }
}
