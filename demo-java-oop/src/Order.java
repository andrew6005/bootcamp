import java.math.BigDecimal;

public class Order {
  private Item[] items;
  private String address;

  private double amount;
  public Order(){

  }

  public Order(double amount) {
    this.amount = amount;
  }

  public double totalAmount() {
    return this.amount;
  }

  public Order(Item[] items){
    this.items = items;
  }

  public double TotalAmount(){
    //double sum =0;
    BigDecimal sum = BigDecimal.ZERO;
    for(int i=0;i<items.length;i++){
      Item item =items[i];
      double subTotal= item.subTotal();
      sum = sum.add(BigDecimal.valueOf(subTotal));
      

    }
    return sum.doubleValue();
  }
  public static void main(String[] args) {
    
  }
}
