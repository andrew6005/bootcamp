

public class Dog extends Animal {
  //private String name;
  //private int age;
  private double weight;


public Dog(){
  
}
public double getWeight(){
  return this.weight;
}
public void setWeight(double weight){
  this.weight = weight;
}
public static void main(String[] args) {
  Dog d1 = new Dog();
  d1.setAge(5);
  d1.setName("john");
  d1.setWeight(9.5);

  System.out.println(d1.getAge());
  System.err.println(d1.getName());
}


    
  
}
