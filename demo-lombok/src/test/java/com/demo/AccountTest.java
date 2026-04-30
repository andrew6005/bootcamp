package com.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
  @Test
  void testAddBlance(){
    Account a1 = new Account();
    Assertions.assertEquals(1000, a1.getBanlance());
    a1.addBlance(200);
    Assertions.assertEquals(2200,a1.getBanlance());


  }

}
