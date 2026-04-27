package com.demo;

public class DemoThread2 {
    private int x;
  public static void main(String[] args) {
   DemoThread2 d =new DemoThread2();

    Thread thresd2 = new Thread();

    Runnable add100task = new Runnable() {
      @Override
      public void run(){
        d.add(200000);
      }
    };
    //Thead use cpu  
    Thread thread1 = new Thread(add100task);
    thread1.start(); 
    Thread thread2 = new Thread(add100task);
    thread2.start();

    try{
      thread1.join();
      thread2.join();

    }catch(InterruptedException e){

    }
    System.out.println(d.getX());
  }
  public synchronized void addone(){
    this.x++;
  }
    public  void add(int time){
    this.x=0;
    for(int i =0 ;i<time; i++){
      //x++;
      this.addone();
    }
  }
public int getX(){
  return this.x;
}

}
