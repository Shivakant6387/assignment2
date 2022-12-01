package com.Lambda.com.Lambda1.com.FunctionalInterface.com;

import java.util.Scanner;

interface Squares{
    int calculate(int x);
}
public class Square {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your value");
        int a=scanner.nextInt();
        Squares squares=(int x)->x*x;
        int ans= squares.calculate(a);
        System.out.println("Square="+ans);
    }
}
