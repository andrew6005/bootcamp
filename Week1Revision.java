public class Week1Revision {
  public static void main(String[] args) {
    System.out.println("hello");
    //8 Primitives +String
     byte b1 =5; //-128to127
     short s1= 3000;//-3xxx -3xxx
     int i1 = 2100000000; //-2100000000-2100000000
     long l1 = 22_00_000_000L;//22_00_000_000-> incalid int value 
                              //22_00_000_000L ->long value

    double d1 = 10.99;// 10.99 is double value
    float f1 =10.99f;//

    boolean bol =true;//true /false

    char  ch1 ='a';//97 ->ascll
    //0-6xxxx

    //math
    //casting()
    //down casting  int -> type
    //over flow
    //divide 0
    //double +double (0.1+0.2)
    int number = 2100000000;
    long number2 = number + 100000000L;
    System.out.println(number2);

    //overflow
    //int +int=int
    int number3 = number +100000000;
    System.out.println(number3);

    //down cast (take my own risk)
    //byte + byte = int +int = int
    //short +short = int +int = int
    //byte + short = int +int = int

    byte by1=100;
    short sh = Short.MAX_VALUE;
    short sh2 = (short) (by1 +sh);
    System.out.println(sh2);

    //double + double = double
    System.out.println(0.1+0.2);

    //string 
    String str1 = "hello";
    System.out.println(str1.length());
    System.out.println(str1.charAt(0));
    System.out.println(str1.length()-1);
    String  str2 = "hello";
    System.out.println(str1.equals(str2));//true

    //index of (rerurn int)
    System.out.println(str1.indexOf("o"));
    //contains (return boolean)
    System.out.println(str1.contains("ll"));
    //substring (end index-1)
    System.out.println(str1.substring(0,3));
    //replace. (return string)
    System.out.println(str1.replace(str1, str2));
    //start with
    System.out.println(str1.startsWith("h"));
    //end with (return string)
    System.out.println(str1.endsWith("llo"));
    //equalsIgnoreCase (return boolean)
    System.out.println("Hello".equalsIgnoreCase("Hello"));
    //compareTo.  (return  int)
    System.out.println("abc".compareTo("ggg"));
    //trim
    System.out.println("helloworld.".trim());
    //is empty
    System.out.println("".isEmpty());
    //is Blank
    System.out.println("  ".isBlank());
    //last indexof (return int) 
    System.out.println("helloabxsdlad".lastIndexOf("e"));
    //concat (return string)
    System.out.println("hello".concat("abcws"));
    //to lowercase to uppercase (return String)
    System.out.println("hello".toUpperCase());
    System.out.println("Hello".toLowerCase());

    char ch2 ='a';
    int ascll =ch2 +1;
   int ascll2 = ch2 + 70000;
   System.out.println(ascll2);
   char ch3 =(char) ( ch2 + 65535+2);
   System.out.println(ch3);
    int age =19;
   boolean isAdult = age >=18;
   if(!isAdult){




    double price =99.9;
    int quantity =10;
    double amount = price * quantity;

    if(amount>=500){
      amount *=0.9;

    }else if(amount>=1000) {
      amount *=0.8;

    }

   }

   String s ="hello";
   String t1= "";
   String t2="";
   for(int i = 0; i<s.length();i++){
    if(i%2==0){
      t1 +=s.charAt(i);
    }else{
      t2 +=s.charAt(i);
    }
    System.out.println(t1);
    System.out.println(t2);


    
    //System.out.println(s.charAt(i));


   }

   int countl=0;
      for(int i =0 ;i <s.length();i++){
    if(s.charAt(i)=='l'){
      //System.out.println(s.indexOf(s));
      countl++;

    }
    System.out.println(countl);

   }
   //counting



    




  }
}
