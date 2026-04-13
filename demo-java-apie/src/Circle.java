public class Circle extends Shape {
  private double radius;
  //private String setcolor;

  public Circle(){

  }
  public double getRadius(){
    return this.radius;
  }
  public void setRadius(double radius){
   this.radius = radius;
  }
  public Circle(double radius){
    //super(Color);
    super();
    this.radius = radius;
  }
  public Circle(double radius,Color color){
    super(color);
    this.radius = radius;
  }


  
  public static void main(String[] args) {
    Circle c1 = new Circle(3.5,Color.RED);
    //System.out.println(c1.Color());
  }
}
