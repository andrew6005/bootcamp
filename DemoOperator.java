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

    //pre /post

    int g = 10;
    //g++;
    //++g;
    System.out.println(g);

    g = g++ * 2;

    //post ++
    int k = g++ * 2; //24(X2 first)
    System.out.println(k);
    System.out.println(g);

    //pre++
    int p =10;
    int k2 =++p * 2;
    System.out.println(k2);
    System.out.println(p);



    int h=10;
    //int y =;
    int y = h*2;
    h++;
    System.out.println(h);
    System.out.println(y);


    int j= 10;
    //int e = ++j*2;
    ++j;
    int e = j * 2;
    System.out.println(j);
    System.out.println(e);


  }
}
