public class Car {
  //color
  //brand
  //year

  private String color;
  private String brand;
  private String year;
  private String model;

 
  public String getColor(){
    return this.color;
  }
  public void setColor(String color){
      this.color = color;
    }
    public String getBrand(){
    return this.brand;
  }
  public void setBrand(String brand){
    this.brand = brand;
  }
  public String getYear(){
    return this.year;
  }
  public void setYear(String year){
    this.year = year;
  }
  
  public static void main(String[] args) {
    Car c1 =new Car();
    c1.setColor("red");
    c1.setBrand("BMW");
    c1.setYear("2020");

    Car c2 = new Car();
    c2.setColor("white");
    c2.setBrand("Mercedes");
    c2.setYear("2021");
    System.out.println(c1.getColor());
    System.out.println(c1.getBrand());
    System.out.println(c1.getYear());
    System.out.println(c2.getColor());
    System.out.println(c2.getBrand());
    System.out.println(c2.getYear());
  }
}
