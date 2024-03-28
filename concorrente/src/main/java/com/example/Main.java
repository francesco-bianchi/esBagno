package com.example;

public class Main {
    public static void main(String[] args) {
        Bagno b1 = new Bagno();
        ThreadB t1 = new ThreadB(b1, "Marco");
        ThreadB t2 = new ThreadB(b1, "Marta");
        ThreadB t3 = new ThreadB(b1, "Francesco");
        ThreadB t4 = new ThreadB(b1, "Lorenzo");
        ThreadB[] att = new ThreadB[4];
        att[0] = t1;
        att[1] = t2;
        att[2] = t3;
        att[3] = t4;

        for(int i=0; i< att.length; i++){
            System.out.println(att[i].getName());
        }

        for(int i=0; i< att.length; i++){
            att[i].start();
        }
    }
}