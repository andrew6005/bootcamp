package com.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
public class DemoOptional {
 





  private static List<Dog>DogDatabase = 
  new ArrayList<>(List.of(new Dog("john",4),new Dog("tom",5),new Dog("andy",8),new Dog("jsda",9)));
  public static void main(String[] args) {
    //Java 8:Optinal

    Optional<Dog> result = searchDog("tom");
    if(result.isPresent()){
      System.out.println(result.get());

    }else{
      System.out.println("not found");
    }
  }

  @AllArgsConstructor
  @Getter
  @ToString
  public static class Dog{
    private String name;
    private int age;
  }

  public static Optional<Dog>searchDog(String dogName){
    if(dogName == null)
    throw new IllegalArgumentException("Dog Name cannot be empty.");
  for (Dog dog : DogDatabase){
    if(dogName.equals(dog.getName())){
      return Optional.of(dog);

    }

  }return Optional.empty();
  }


 //new ArrayList<>(List.of(new Dog("john",4),new Dog("tom",5),new Dog("andy",8),new Dog("jsda",9)));

  List<Dog> dogName = Arrays.asList(new Dog("john",4),new Dog("tom",5),new Dog("andy",8),new Dog("jsda",9));
   

  public static Optional<Dog> searchDog3(String dogName){
    return DogDatabase.stream()
    .filter(e -> dogName.equals(e.getName()))
    .sorted((d1,d2)-> d1.getAge()>d2.getAge()? -1:1)
    .findFirst();
  }

  }
  //private Optional<String> name;//*1.Database don`t know what Optional is. */
  //*method input paramter(create meaningless coding) */


