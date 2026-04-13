//*Animal is an abstract description of Cat /Dog
//* object()


public abstract class Animal {

  // common Attributese
  private String name;
  private int age;
  public Animal(){
    
  }
 
  public Animal(String name, int age){
    this.name= name ;
    this.age = age;
  }
  
public String getName(){
  return this.name;

}
public int getAge(){
  return this.age;
}
public String setName(String name){
  return this.name;
}
public int setAge(int age){
  return this.age;
}

}

