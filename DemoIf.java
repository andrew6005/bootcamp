public class DemoIf {
  public static void main(String[] args) {
    int age=13;
    //>,<,>=,<=

    if(age <=18){
      System.out.println("hello");
    }


    if(age >= 18) {
      System.out.println("adult");
      }else{
      System.out.println("child");

    }

    age = 70;
    if(age>65){
      System.out.println("Fee=2");

    }

    boolean isElderly = age >65;
    if(isElderly){
      System.out.println("Fee=2");

    }
    if (isElderly == true){
      System.out.println("Fee=2");

    }

    //&& ||
    int a = 20;
    if(a> 5 && a <= 20){
      System.out.println("a is between 5 and 20");

    }

    if(a> 5 || a <= 20){
      System.out.println("a is either >=5 or <= 20");

    }

    int b=18;
    if(a>20 || b >12){
      System.out.println("hello");
    }else{
      System.out.println("goodbye");
    }
    if(a > 20 || b > 6 && b < 20){
      System.out.println("correct");
    }

    if(b > 6 && b < 20 || a > 20 ){
      System.out.println("correct2");
    }
    int age2 = 9;
    boolean ischild = age2 < 10;
    if (ischild == true){
      System.out.println("this is children" );
    }

    // double,char,string(comparsion)
    //String -> methods



    



    

  }
}
