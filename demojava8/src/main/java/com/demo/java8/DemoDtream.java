package com.demo.java8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoDtream {
  public static void main(String[] args) {
    //Loop
    // 1.
    List<String> names = new ArrayList<>(List.of("john", "peter","tom"));
   /* for(int i = 0; i<names.size();i++){
      System.out.println(names.get(i));
    }

    for(String name :names){
      System.out.println(name);

    }
    int idx =0;
    while(idx < names.size()){
      System.out.println(names.get(idx));

    }

    names.stream()//
    .forEach(name->System.out.println(name));*/
    //* filter if
    names.stream().filter(name->name.length()>=5).forEach(name->System.out.println(name));
    List<String> newNames = names.stream().filter(name->name.startsWith("p")&& name.length()>=5)
    .collect(Collectors.toList());
    System.out.println(newNames);
//* map
List<Cat> cats =names.stream().filter(name-> name.startsWith("j"))
.map(name -> new Cat(name))
.collect(Collectors.toList());
System.out.println(cats);

   /*for(String name: names){
    if(name.startsWith("j")){
      newCats.add(new Cat(name));
    }
   }System.out.println(newCats);*/


   List <Dog> dogs = new LinkedList<>(List.of(new Dog(10,"steve"),new Dog(20,"john")));
   List <Integer> dogsAges = dogs.stream()
   .map (age -> Dog.getAge())
   .collect(Collectors.toList());

/* *
  dogsirtec .sorted((d1,d2)-> d1.getAge()>d2.getAge()?-1:1)
.collect(Collectors.toList());
  
   System.out.println(dogsirtec);

   disttinct equals;
   .filler (dogs->dog).getAge,disttinct(),scoulll().collerct.collertionsto stre=a;
   System.err.out();
   System.out.println();

  )*/

   
  } 
}
