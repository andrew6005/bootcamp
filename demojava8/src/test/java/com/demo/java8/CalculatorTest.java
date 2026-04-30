package com.demo.java8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class CalculatorTest { //! TDD Test Driven Design
  @Test
  void testCalculator(){
    Calculator c1 = new Calculator();
    Assertions.assertEquals(15, c1.sum());
    //c1.setX(-5);
   
  }
  
}
