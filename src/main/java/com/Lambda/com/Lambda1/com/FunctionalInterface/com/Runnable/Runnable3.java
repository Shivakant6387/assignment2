package com.Lambda.com.Lambda1.com.FunctionalInterface.com.Runnable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Studentses {
    int rollno;
    
    String name;
    private  String address;

    Studentses(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
        public String toString(){
        return this.rollno+""+this.name+""+this.address;


        }
}
class Sortbyroll implements Comparator<Studentses> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Studentses a, Studentses b)
    {

        return a.rollno - b.rollno;
    }
}
class Sortbyname implements Comparator<Studentses> {

    // Method
    // Sorting in ascending order of name
    public int compare(Studentses a, Studentses b)
    {

        return a.name.compareTo(b.name);
    }
}
public class Runnable3 {
    public static void main(String[] args) {
        ArrayList<Studentses>arrayList=new ArrayList<>();
        arrayList.add(new Studentses(111,"Mayank","London"));
        arrayList.add(new Studentses(131,"Anshul","Eta"));
        arrayList.add(new Studentses(101,"Pradeep","Mathura"));
        arrayList.add(new Studentses(131,"Sachin","Mathura"));
        System.out.println("unsorted");
        for (int i=0;i<arrayList.size();i++)
            System.out.println(arrayList.get(i));
        Collections.sort(arrayList,new Sortbyroll());
        System.out.println("\nSorted by  roll no");
        for (int i=0;i<arrayList.size();i++)
            System.out.println(arrayList.get(i));
        Collections.sort(arrayList,new Sortbyname());
        System.out.println("\nSorted by name");
        for (int i=0;i<arrayList.size();i++)
        System.out.println(arrayList.get(i));
    }
}
