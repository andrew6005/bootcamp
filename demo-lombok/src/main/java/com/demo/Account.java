package com.demo;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString
@EqualsAndHashCode
public class Account {
  private  double banlance;

  public void addBlance(double amount){
    this.banlance=BigDecimal.valueOf(this.banlance)
          .add(BigDecimal.valueOf(amount))
          .doubleValue();


  }

 /*  public Account(){
    this.banlance=1000;
  }*/
  public void deductBlance(double amount){
    this.banlance=BigDecimal.valueOf(this.banlance)
          .add(BigDecimal.valueOf(amount))
          .doubleValue();

  } 
  

  //! constructar, get set
  public static void main(String[] args) {
    Account a1 = new Account();
    Account a2 = new Account(100.9);

    System.out.println(a2.getBanlance());
    a2.setBanlance(9999.9999);
    System.out.println(a2.getBanlance());
    System.out.println(a2);

    Account a3 = new Account(100.9);
    System.out.println(a2.equals(a3));
    

  }



}
