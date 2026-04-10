import java.math.BigDecimal;

public class Circle {
 private double radius;


  public double getRadius(){
    return this.radius;
  }
  public void setRadius(double radius){
    this.radius = radius; 


}

public Circle(){

}

 public  double area(){
  return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
 }
  public static void main(String[] args) {
    System.out.println(new Circle(3.5).area());
    
    //System.out.println(c1.getRadius());
    //System.out.println(c1.area());
  }
}