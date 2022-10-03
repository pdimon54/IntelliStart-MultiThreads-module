package org.example;

import java.util.Timer;
import java.util.TimerTask;

public class SomeTimeSleepsThread {
    public static void printPerFiveSecond(Timer timer){
        timer.schedule(new TimerTask() {
            int initialSecond = 0;
            @Override
            public void run() {
                System.out.println("Пройшло секунд з запуску програми: " + initialSecond);
                initialSecond++;
            }
        }, 0, 1000);
    }

    public static void printCurrentSecondCount(Timer timer){
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Пройшло 5 секунд");
            }
        }, 5000, 5000);
    }

}
