public class Dog {
  //Attribute (memory)
  private Dog dog;
  private String name;
  public Dog(String name){
    this.name = name;
  }
  public void setDog(Dog dog){
    this.dog=dog;
  } 
  public Dog getDog(){
    return this.dog;
  }
  public String getName(){
  return this.name;
  }
  public static void main(String[] args) {
    Dog d1 = new Dog ("john");
    d1.setDog(new Dog("mary"));
    d1.getDog().setDog(new Dog("perter"));
  }
}
