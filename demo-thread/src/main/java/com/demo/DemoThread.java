package com.demo;

public class DemoThread {

  //! multi Thread 
public static void main(String[] args) {
  
 Runnable task =  new PrintHelloworldTenTime() ;
    
 //* we don`t know when worker and worker2 comback
 //* worker1 behvior does not depend worker  */
  Thread worker1 = new Thread(task);
  worker1.start();
  Thread worker2 = new Thread(task);
  worker2.start();
  System.out.println("goodbye");

}



  
}
