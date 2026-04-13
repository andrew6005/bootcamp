public abstract class Shape {
  private double width;
  private double height;
  private double area;
  private Color Color;

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
}
