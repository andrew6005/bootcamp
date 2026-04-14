public abstract class Shape {
  private double width;
  private double height;
  private double area;
  private Color Color;
  public Object getColor;

  public Shape(){

  }
  public Shape(Color color){
    this.Color = color;
  }
  public Shape(double width ,double height, double area ){
    this.height=height;
    this.width=width;
    this. area= area;


  } 

  public double getHeight(){
    return this.height;
  }
   public double width(){
    return this.width;
  }
 public double getarea(){
    return this.area;
  }
  public double setHeight(){
    return this. height;
  }
   public double setWidth(){
    return this.width;
  }
   public double setaArea(){
    return this.area;
  }
  /*public double CircleArea(){
    return -0.1;
  }*/

  abstract double CircleArea();
  public static void main(String[] args) {
    Shape s1 = new Circle(3.5);
    System.out.println(s1.CircleArea());
  }
  public boolean equalCircle(Object obj) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'equalCircle'");
  }
}
