package com.demo;

import java.util.ArrayList;

public class DemoThread3 {

    private ArrayList<String> values;

    public static void main(String[] args) {

        DemoThread3 d = new DemoThread3();

        Runnable addString = new Runnable() {
            @Override
            public void run() {
                d.add();
            }
        };

        Thread thread1 = new Thread(addString);
        Thread thread2 = new Thread(addString);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ArrayList size = " + d.values);
    }

    public DemoThread3() {
        this.values = new ArrayList<>();
    }

    public synchronized void add() {
        for (int i = 0; i < 1000; i++) {
            this.values.add("String " + i);
        }
    }
}