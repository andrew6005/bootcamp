public class selflearning {
  public static void main(String[] args) {
    double a =0.2;
    double b =3.3;

    if (a>0.1 || b<0.5){
      System.out.println("correct");
    }else{
      System.out.println("error");
    }
    if(a<0.1 && b>3.2){
      System.out.println("correct2");
    }else{
      System.out.println("error2");
    }

    String a1 ="bus";
    String a2 = "car";
    String a3 = "train";
    

    if (a1.length()== a2.length()) {
      System.out.println("the two word length is same");

      
    }else{
      System.out.println("the two word length is not same");
    }
    
      int sum = 0;
    for (int i = 0; i < 50; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
        sum += i;
      }
    }
    System.out.println("The sum is " + sum);
    
  }
}
