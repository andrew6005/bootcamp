public class primitive {
  //RAM -> Stack,heap memory(short term)
  public static void main(String[] args) {
    //java cannot convert different type of data directly
    int appleCount = 3;
    // double -> with decimal
    double appleprice =30.3;
    System.out.println("hello");
    System.out.println(appleCount);
    System.out.println(appleprice);
    //primitive(raw data type)
    //int ,double , byte, short, long, boolean, char ,float,
    boolean b1 = false;
    boolean iseElderly = true;

    System.out.println(iseElderly);
// char is single character only but cannot no character
    char c1 = 'a';
    char c2 = '!';
    char c3 = '*';
    char c4 = '#';


    int i1;
    int i3 = 2100000000;

    byte by1 = 127;
    byte by2 = -128;
    //long  2^63

    //short
    short s1 = -32768;
    short s2 = 32767;

    int k1  = 1_000_000;

    //double 
    //d1 (double variable)
    double d1 = 100.99;
    //100.99f(float value)
    float f1 = 100.99f;


    float f2 = 1234.99f;


    int i20 = 100;

    long l20 = 200L;

    char ch4 = '5';
    //char +int ->int
    System.out.println('a'+1);
    char c10 = 'a';
    char c11 = 'a'+1;
    System.out.println(c11);
    char c12 = 'a'+25;
    System.out.println(c12);
    char c13 ='a';
    char c14 = 'b';

    

  }
}