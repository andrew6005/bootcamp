package com.demo;

import java.util.Hashtable;
import java.util.Map;;

public class HashTable {

  private static Map <String,String> map;

  public HashTable(){
    this.map = new Hashtable<>();
  }
public static void main(String[] args) {
  

 Hashtable d = new Hashtable<>();

        Runnable addString = new Runnable() {
            @Override
            public void run() {
              map.add();
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

public void put(String key,String value){
  this.put(key, value);
}
    
//hashmap
 

    public boolean  add(String values) {
       return ((HashTable) this.map).add(values);
    }
    public int size(){
      return this.map.size();

    }
}
