package com.Lambda.com.Lambda1.com.FunctionalInterface.com;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Func1 {
    public static void main(String[] args) {
        List<String>names= Arrays.asList("Geek","GeekQuiz","g1","Qa","Geek2");
        Predicate<String>predicate=(s )->s.startsWith("G");
        for (String str:names){
            if (predicate.test(str))
                System.out.println(str);
        }
    }
}
