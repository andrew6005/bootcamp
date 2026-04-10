public class Person {
  private String name;
  private double height;
  private double weight;

  public Person(){

  }
  //* Createing object
  public Person(String name, double height, double weight){
    this.name = name;
    this.height = height;
    this.weight = weight;

  }

  //instance method
  //presetation(APIE:encapsulation)
  public boolean overweight(){
    if(this.weight > 25){
      return true;
    } 
    //base case
      return false;
    
  }
  public String bmigroup(){
    
    if(this.Bmi() < 18.5){
      return "underweight";
    } else if(this.Bmi() >= 18.5 && this.Bmi() < 25){
      return  "normal";
    } else {
      return "overweight";
    } 
  }



 

  //bmi = weight/height^2
  public double Bmi(){
    return this.weight / (this.height * this.height);
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name; 
  }
  public double getHeight(){
    return this.height;
  }
  public void setHeight(double height){
    this.height = height;
  }
  public double getWeight(){
    return this.weight;
    
  }
  public void setWeight(double weight){
    this.weight = weight;
  } 

  //main = run time
  //*  JVM exceute main mothod
  public static void main(String[] args) {
    Person p1 = new Person(); 
    p1.setName("john");
    p1.setHeight(1.75);
    p1.setWeight(70.5);
    System.out.println(p1.overweight());
    System.out.println(p1.bmigroup());



  }
}