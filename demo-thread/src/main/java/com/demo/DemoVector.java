package com.demo;

import java.util.ArrayList;
import java.util.Vector;

public class DemoVector {
  private Vector<String> values;
  public static void main(String[] args) {
    // vector synchronized version of Arraylist

 
   DemoVector d = new DemoVector();

        Runnable addString = new Runnable() {
            @Override
            public void run() {
                d.add("abc");
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

        System.out.println("ArrayList size = ");
    }

    //public ß
//hashmap
    public DemoVector() {
        this.values = new ArrayList<>();
    }

    public boolean  add(String values) {
       return this.values.add(values);
    }
    public int size(){
      return this.values.size();

    }
    

  }

