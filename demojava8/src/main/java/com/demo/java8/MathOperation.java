package com.demo.java8;
@FunctionalInterface
public interface MathOperation <T extends Number,U extends Number,

R extends Number>{
  R compute (T t,U u);


  //int compute(int x, int y);
  
  
} 

