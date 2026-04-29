package com.demo.java8;

import lombok.var;

public class DemoTypeInference {
  public static void main(String[] args) {
    var x = 3;
    //! Attribute type
    



   x= x+10;
   
   var y ="hello";
   System.out.println(x);
   System.out.println(y.charAt(0));
   
   

  }
  //return object type(java ok)
  public static Object sum(int x, int y){
    return x+y;
  }
}
