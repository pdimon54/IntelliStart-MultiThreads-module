package org.example;

public class CheckNumberThread extends Thread{
    @Override
    public void run() {
        new Thread(() -> System.out.println()).start();
    }

    private static void fizzbuzz(){

    }

}
