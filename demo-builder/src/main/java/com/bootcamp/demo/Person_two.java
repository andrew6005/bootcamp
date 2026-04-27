package com.bootcamp.demo;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class Person_two {
  
 private String name;
  private int age;






  public static void main(String[] args) {
   Person_two p1= Person_two.builder()
          .name("john")
          .age(20)
          .build();
  System.out.println(p1.getAge());
  System.out.println(p1.getName());
  }
}
