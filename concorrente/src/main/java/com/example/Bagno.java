package com.example;

import java.util.concurrent.Semaphore;

public class Bagno {
    private Semaphore s = new Semaphore(1);
    private int indice = 0;
    ThreadB[] att = new ThreadB[4];

    public int entra(ThreadB b){
        System.out.println(b.getName() + " è entrato in bagno");
        return (int) (Math.random()*10) +1;
    }

    public void esci(){
        System.out.println("Bagno libero");
    }

    public Semaphore getS() {
        return s;
    }

}
