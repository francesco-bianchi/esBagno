package com.example;

import java.util.ArrayList;

public class ThreadB extends Thread {
    private Bagno b;
    private String name;

    public ThreadB(Bagno b, String name){
        super(name);
        this.b = b;
    }

    public void run(){
        String name = Thread.currentThread().getName();
        try{
            this.b.getS().acquire();
            int t = b.entra(this);
            System.out.println(name + " occupa il bagno per: " + t + " secondi");
            Thread.sleep(t);
            b.esci();
            this.b.getS().release();
        }
        catch(InterruptedException i){
            i.printStackTrace();
        }
    }
}
