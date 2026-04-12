import java.math.BigDecimal;

public class Area {
  private double length;
  private double width;
  private long height;

  public void setLength(double length){
    this.length = length;
  }
  public double getLength(){
    return this.length;
  }
  public void setWidth(double width){
    this.width = width;
  }
  public double getWidth(){
    return this.width; 
  }
  public BigDecimal calculateTrapezoidalArea() {
    return BigDecimal.valueOf(this.length)
            .add(BigDecimal.valueOf(this.width))
            .multiply(BigDecimal.valueOf(this.height))
            .divide(BigDecimal.valueOf(2));
}
  public BigDecimal calculatearea(){
    return BigDecimal.valueOf(this.height).multiply(BigDecimal.valueOf(this.width));
    //this.length * this.width;
  }
  public BigDecimal trianglearea(){
    return BigDecimal.valueOf(this.length).add(BigDecimal.valueOf(height)).divide(BigDecimal.valueOf(2));
    //this.length * this.width / 2;
  }

  public static void main(String[] args) {
    Area a1 = new Area();
    a1.setLength(100.8);
    a1.setWidth(5.5);

    Area a2 = new Area();
    a2.setLength(200.9);
    a2.setWidth(1005.5);


    System.out.println(a1.calculateTrapezoidalArea());
    System.out.println(a1.calculatearea());
    System.out.println(a1.trianglearea());
    System.out.println(a2.calculateTrapezoidalArea());
    System.out.println(a2.calculatearea());
    System.out.println(a2.trianglearea());

    
  } 


}
