public class DemoOperator {
  public static void main(String[] args) {
    //+ - * /
    //%(find remainder)
    int remainder= 5 % 2;

    System.out.println(remainder);

    System.out.println(5%6);

//++ --
    int a =10;
//+= -= *= /=
    a = a + 1;
    a+=1;
    a++;
    ++a;

    System.out.println(a);

    int b = 20;

    b=b-1;
    System.out.println(b);
    b-=1;
    System.out.println(b);
    b--;
    System.out.println(b);
    --b;
    System.out.println(b);

    

  }
}
