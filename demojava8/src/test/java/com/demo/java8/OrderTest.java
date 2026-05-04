package com.demo.java8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class OrderTest{
  private Order order;

  @BeforeEach
  void beforEach(){
    this.order = new Order();
  }

  @Test
  void TestCreateOrder(){
  
  Assertions.assertEquals(0, this.order.getItems().size()); 
   Assertions.assertTrue(this.order.getItems()instanceof LinkedList);
 
}
@Test
void testAdd(){
  Assertions.assertEquals(0,this.order.getItems().size());
  this.order.add(new Order.Item(3.5, 5));
  Assertions.assertEquals(1,this.order.getItems().size());
}

@Test
void testAdd2(){
  assertEquals(0,this.order.getItems().size());
  this.order.add(new Order.Item(3.5, 5));
  asserThat(this.order.getItems(),hasItem(apple));

}

}
