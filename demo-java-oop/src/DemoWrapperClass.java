public class DemoWrapperClass {
  
public static void main(String[] args) {
  // primitive (byte,shor,int,long,float,double,char, boolean)
  //wrapper. class
   byte b1= 100;
  Byte b2=100;

  short s1 =100;
  Short s2 =100;

  int x1=100;
  Integer x2 = 100;

  //Integer compareTo

  //! Alway use mothod for comparsion
  if(x2.compareTo(100)>0){//check if X2is larger than 100


  }
  if(x2.compareTo(100)<0){//check x2 is samller than 100

  }
  if(x2.equals(100)){//check if x2 equals to 100

  }
 if(!x2.equals(100)){//check if x2 not equals to 100 

  }
  long l1=100L;
  Long l2=100L;

  float f1=9.0f;
  Float f2 =9.0f;

  double d1=100.0;
  Double d2= 100.0;

  char ch1='c';
  Character ch2 ='c';

  if(ch2.equals('c')){
    System.out.println("equals");

  }
  if(ch2.compareTo('c')>0){
    System.out.println("Acsii left >right");

  }

  boolean o1 =true;
  boolean o2 = false;




  //Internal cache

  Integer k1 =127;
  Integer k2 =127;
  System.out.println(k1.equals(k2));
  System.out.println(k1==k2);

  Integer k3=128;// create a new object, because not in the range of common
  Integer k4=128;// create a new object, because not in the range of common
  System.out.println(k3.equals(k4));
  System.out.println(k3==k4);
  //!-128 to 127 java define a range of common use number
  //Integer (class/object)-> comparsion -> compareTo , equals 
    //!Implicit promotion 
    float f10= 100L;
    double d10 =10.9f;
    float f12 = 19; 
    byte b10 =127;
    double d11 = b10;//ok (Assign byte value into double varibale)
    int x10 ='a';
    double d12 ='a';//ok 97.0
//! wrapper class vs Primitives (auto - box / un box)
//! auto box (long ->Long)
    //int x11 = d12;//! risky
    //! unsafe down casting (java dislow)
    //int x11 = d12//!risky
    int x11 =(int )d12;//take risky overflow
    System.out.println(x11);//97
    long L20 = 100;
    //Long l21 =100;
    //auto-box (long -> Long)
    Long l30= 100L;//long to Long 
    Integer i30=100; //int ->Integer
    Character ch30='x';

    //! un -box(Long ->long)
    long l31 =l30;
    int i31 = i30;
    char  ch31= ch30;

    //! java would not auto convent "implicit promotion" and auto box at the same time

    //Long l21=100;//int-> long (implicit promotion)-> Long (auto box)
    //Double d100=10;//int-> double ->Double

    //! unsafe  down csting (Java disallow)
    //int x12 = d12;risky over 
    int x12 = (int) d12;//take risk ->overflow
    System.out.println(x11);//97





  }
}
