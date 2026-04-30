package com.demo.java8;

import javax.xml.crypto.dsig.TransformException;

public class DemoREcord {
  public static void main(String[] args) {
     Transaction  t1 = new Transaction("Fund_Tran",100);
     System.out.println(t1.type());
     System.out.println(t1.amount());
     
     Transaction t2 = new Transaction("Fund_Tran",100);
     System.out.println(t1.equals(t2));
     System.out.println(t1.hashCode());
     System.out.println(t1);
  }
}
