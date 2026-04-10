import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("please input the number");
    int number = s.nextInt();
    //System.out.println(number);

    if (number%2==1){
      System.out.println("this is the odd number");

    }else{
      System.out.println("this is the even number");
    }

  }
}
