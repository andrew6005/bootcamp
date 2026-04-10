import java.time.LocalDate;
import java.math.BigDecimal;

public class Customer {
  private String firstname;
  private String lastname;
  private char gender;
  private LocalDate dob;
  private Order[] orders;

  public Customer() {
  }
  public Customer(Order[] orders){
    this.orders = orders;
  }

  public Customer(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  public Customer(String firstname, String lastname, char gender, LocalDate dob) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.gender = gender;
    this.dob = dob;
  }

  public boolean isVip() {
    return this.totalOrderAmount() > 100000;
  }

  public double totalOrderAmount() {
    BigDecimal sum = BigDecimal.ZERO;

    if (this.orders == null) {
      return 0;
    }

    for (int i = 0; i < this.orders.length; i++) {
      sum = sum.add(BigDecimal.valueOf(this.orders[i].totalAmount()));
    }

    return sum.doubleValue();
  }

  public int getBirthYear() {
    return this.dob.getYear();
  }

  public LocalDate getDob() {
    return this.dob;
  }

  public String getFirstName() {
    return this.firstname;
  }

  public void setOrders(Order[] orders) {
    this.orders = orders;
  }



  public static void main(String[] args) {
    Customer c1 = new Customer();
    Customer c2 = new Customer("john", "chan", 'M', LocalDate.of(1990, 1, 1));
    Customer c3 = new Customer("Leo", "Lau");

    System.out.println(c1.getFirstName()); // null
    System.out.println(c2.getBirthYear()); // 1990
    System.out.println(c2.getDob().getYear()); // 1990

    Customer c4 = new Customer("Mary", "Lee", 'F', LocalDate.of(1988, 5, 20));
    Item rice=new Item("rice",1200.9,30);
    Item water=new Item("water",300.6,30);
    Item fish = new Item("fish",47784.8,30);

    Item[] items = new Item[2];
    items [0] = rice;
    items [1] = water;
    
    Item[] items2 = new Item[1];
    items2 [0] = fish;

    Order o10 = new Order(items);
    Order o11 = new Order(items2);
    System.out.println(o11.totalAmount());

    Order[] orders = new Order[2];
    orders[0] = o10;
    orders[1]= o11;
    Customer c10 = new Customer(orders);
    //c10 = new Customer(orders);
    System.out.println(c10.totalOrderAmount());
    System.out.println(c10.isVip());

    







    

    

    
  }
}