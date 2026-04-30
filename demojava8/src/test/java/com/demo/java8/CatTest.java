package com.demo.java8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CatTest {
  @Test

  void testCat(){
   Cat c1= new Cat("john");
   Assertions.assertEquals("john", c1.getName());
  }
}
