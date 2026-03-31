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








  }
}