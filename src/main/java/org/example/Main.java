package org.example;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("First task:");

        Timer t1 = new Timer();
        SomeTimeSleepsThread.printPerFiveSecond(t1);

        Timer t2 = new Timer();
        SomeTimeSleepsThread.printCurrentSecondCount(t2);
        //////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////
        System.out.println("Second task:");



//        final int initialNumber = 15;
//
//        Thread A = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                if (initialNumber%3 == 0 &&initialNumber%5 == 0){
//                    System.out.println("fizzbuzz");
//                }
//            }
//        });
//
//        for (int i = 1; i <= initialNumber; i++) {
//            new Thread(() -> ().start();
//        }


    }
}