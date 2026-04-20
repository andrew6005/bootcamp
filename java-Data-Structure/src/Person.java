public class Person implements Comparable<Person>{
public static Person head;
private int age;
private String name;
public int getAge(){
  return this.age;
}
public Person(int age){
  this.age =age;
}

@Override
public int compareTo(Person person){
return this.age>person.getAge()?-1:1;

  
}
  @Override
  public String toString(){
        //return "Cat(name="+ this.name +")";

        return "Person("+"age="+this.age+")";
    }

    public static void main(String[] args) {
       //Cat c1= new People("john");
        //System.out.println(c1);
    }
    





}
