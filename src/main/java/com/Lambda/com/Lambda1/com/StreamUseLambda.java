package com.Lambda.com.Lambda1.com;

import java.util.ArrayList;
import java.util.List;

public class StreamUseLambda {
    static List<String >places=new ArrayList<>();
    public static List getPlace(){
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");
        return places;
    }

    public static void main(String[] args) {
        List<String>myPlace=getPlace();
        System.out.println("places from Nepal");
        myPlace.stream().filter((p)->p.startsWith("Nepal"))
                .map((p)->p.toUpperCase())
                .sorted()
                .forEach((p)-> System.out.println(p));
    }
}
