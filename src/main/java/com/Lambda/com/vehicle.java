package com.Lambda.com;

public interface vehicle {
    void fuel();
    void speedUp();
    void mirror();
    void gar();
    default void licence(){
        System.out.println("Added licence all person");
    }

}
