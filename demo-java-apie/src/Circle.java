public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
      
      throw new UnsupportedOperationException("Unimplemented method 'area'");
    }

 
}