import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    System.out.println(0.1+0.2);
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");

    BigDecimal result = bd1.add(bd2);
    System.out.println(result);

    double bonus = 1500.99;
    double salary = 22500.99;
    System.out.println(salary+bonus);

    BigDecimal bonus2 = BigDecimal.valueOf(1500.99);
    BigDecimal result2 = BigDecimal.valueOf(22500.99)//
    .add(BigDecimal.valueOf(1500.99));
    System.out.println(result2);
    //*+ add
    //*- subtract
    //*  mulipty
    //* */ / divide
   
      //double a =0.3;
      //double b= 0.2;
    BigDecimal result3 =BigDecimal .valueOf(0.3).subtract(BigDecimal.valueOf(0.1));
    System.out.println(result3);

    BigDecimal result4= BigDecimal.valueOf(0.1).multiply(BigDecimal .valueOf(0.2));
    System.out.println(result4);

    //* 10/3 = 3.3333
    //* rounding 

    //*BigDecimal result5 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3));
    //*System.out.println(result5);*//
    
    BigDecimal result5 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3),2, RoundingMode.HALF_UP);
    System.out.println(result5);
    BigDecimal result7 = BigDecimal.valueOf(6.7).divide(BigDecimal.valueOf(2));
    BigDecimal result6 = BigDecimal.valueOf(6.7).divide(BigDecimal.valueOf(2),1, RoundingMode.HALF_DOWN);
    System.out.println(result6);
    System.out.println(result7);

    BigDecimal db3 = BigDecimal.valueOf(10.0);
    BigDecimal db4 = BigDecimal.valueOf(0.0);

    //*. risk (divide zero) ->avoid 
    if(!db4.equals(BigDecimal.valueOf(0.0))){
      BigDecimal result8 = db3.divide(db4,1,RoundingMode.HALF_DOWN);
      System.out.println(result8);
    }
    
 

  }
}
