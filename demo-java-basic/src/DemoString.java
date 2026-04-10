public class DemoString {
  public static void main(String[] args) {

    String s1 = "h"+"!!!";
    char c1 = 'h';
    //string has mothmod
    //lenght()
    System.out.println(s1.length());
    System.out.println(s1);

    //2.charat

    String S2 ="hello";

    System.out.println(S2.charAt(2));
    System.out.println(S2.charAt(S2.length()-1));

    //3.eqauls
    String s3= "hello";
    System.out.println(S2.equals(s3));

    //false
    String s4 = "hello";
    String s5 = "Hello";
    System.out.println(s4.equals(s5));

    //4. is emtpty
    String s6 ="";
    System.out.println(s6.isEmpty());
    System.out.println(s4.isEmpty());

    if(s6.isEmpty()){

    }
  // 5. isBlank()

  String s7 ="    ";
  System.out.println(s7.isBlank());
  System.out.println(s7.isEmpty());

  //6.tolower case
  String lowercase = s4.toLowerCase();
  String uppercase = s4.toUpperCase();
  System.out.println(s4);
  System.out.println(lowercase); 
  System.out.println(uppercase); 


  //7.contains
  if (s4.contains("ll")){
    System.out.println("contains ll");
  }else{
    s4.contains("lll");
    System.out.println("error");
  }
  //start with /end with
  if(s4.startsWith("he")){
    System.out.println("start with He ");
  }
  if(s4.endsWith("llo")){
    System.out.println("end with llo");
  }
  //9. replace

  String s10 = "Bootcamp";

  String s11 = s10.replace('o','x');
  System.out.println(s11);

  String s12 = s10.replace("camp", "");
  System.out.println(s12);

  //10.substring(star index , end index)

  String s13  ="hello";
  String ss = s13.substring(2, 4);
  System.out.println(ss);

  System.out.println(s13.substring(1));

  //11.indexof
  String s14 ="BootCamp";
  System.out.println(s14.indexOf('o'));
  System.out.println(s14.indexOf("Camp"));
  System.out.println(s14.indexOf("java"));
  System.out.println(s14.indexOf("CAMP"));
  System.out.println(s14.indexOf(97));
//last index of
  System.out.println(s14.lastIndexOf('o'));
  System.out.println(s14.lastIndexOf("oo"));
  //System.out.println(s14.lastIndexOf(""));

  //13.trim trim first

  String s15="  hello world ";
  String afterTrim = s15.trim();
  System.out.println(afterTrim);
  System.out.println(s15.replace(" ", ""));

  //14. concat
  String s16 = "hello";
  String s17 = "world";
  String combine = s16.concat(s17);
  System.out.println(combine);
  //15.compare To
  String s18 = "abc";
  String s19 = "def";
  System.out.println(s18.compareTo(s19));

  if (s18.compareTo(s19)>0){
    System.out.println("s18>s19");

  }else {
    System.out.println("s19>s18");
  }
  //16.equals ignore case
  String s20 = "John Lau";
  String s21 = "JOHN LAU";
  if(s20.equalsIgnoreCase(s21)){
    System.out.println("this is the name same");
  }


  }
}