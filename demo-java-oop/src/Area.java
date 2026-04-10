public class Area {
  private double length;
  private double width;

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
  public double calculatetrapezoidalarea(){
  return this.length + this.width * this.length/2; 
  }
  public double calculatearea(){
    return this.length * this.width;
  }
  public double trianglearea(){
    return this.length * this.width / 2;
  }

  public static void main(String[] args) {
    Area a1 = new Area();
    a1.setLength(10.8);
    a1.setWidth(5.5);

    Area a2 = new Area();
    a2.setLength(20.9);
    a2.setWidth(10.5);


    System.out.println(a1.calculatetrapezoidalarea());
    System.out.println(a1.calculatearea());
    System.out.println(a1.trianglearea());
    System.out.println(a2.calculatetrapezoidalarea());
    System.out.println(a2.calculatearea());
    System.out.println(a2.trianglearea());

    
  } 


}
