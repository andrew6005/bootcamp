public class DemoStringII {
  public static void main(String[] args) {
    //! "hello" -> JVM create object in string pool
    String s1 = "hello";
    String s2 ="hello";
    System.out.println(s1.equals(s2));//true
    //!new -> produce object (forcce)
    String s3 = new String("hello"); //produc string object
    String s4 = new String("hello");
    //! don't use == for comparsion forever
    //! for class object (non primitive ) always use equals for camparsion
    //! == checking if they are in same address 
    System.out.println(s1==s2);
    System.out.println(s4==s3);
    System.out.println(s1==s3);
    System.out.println(s2==s4);
    //! quals check if they are with same String value
    if(s1.equals(s4)){


    }
    //! ALL primitives still use == for comparsion.
    int x =3;
    if(x==3){

    } 

    Person p2 = new Person();
    Person p3= new Person();

    System.out.println(p2.equals(p3));//! false



  }
}
