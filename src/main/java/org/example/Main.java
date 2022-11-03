package org.example;

import java.util.Timer;
import java.util.TimerTask;
import java.util.function.IntConsumer;

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

        final int initialNumber = 15;
        CheckNumberThread checkNumberThread = new CheckNumberThread(initialNumber);
        Thread A = new Thread(() -> {
            try {
                checkNumberThread.fizz(()->System.out.println("fizz"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread B = new Thread(() -> {
            try {
                checkNumberThread.buzz(()->System.out.println("buzz"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread C = new Thread(() -> {
            try {
                checkNumberThread.fizzbuzz(()-> System.out.println("fizzbuzz"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread D = new Thread(() -> {
            try {
                checkNumberThread.number(
                    value -> System.out.println(checkNumberThread.getCurrentNumber()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        A.start();
        B.start();
        C.start();
        D.start();
    }
}