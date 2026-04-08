public class circle {
 private double radius;

  public double getRadius(){
    return this.radius;
  }
  public void setRadius(double radius){
    this.radius = radius; 


}

 public  double area(){
  return this.radius * this.radius * 3.14;
 }
  public static void main(String[] args) {
    circle c1 = new circle();
    c1.setRadius(5);
    System.out.println(c1.getRadius());
    System.out.println(c1.area());
  }
}