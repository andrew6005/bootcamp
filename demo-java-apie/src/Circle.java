
import java.math.BigDecimal;
import java.util.Objects;

public class Circle extends Shape {
  private double radius;

  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, Color.Black);
    Circle c2 = new Circle(3.8, Color.Black);
    System.out.println(c1.equals(c2));
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.radius, getColor());
  }

  /*private Object getColor() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getColor'");
  }*/

  private Object getColor() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getColor'");
  }

  @Override
public boolean equals(Object obj) {
  if (this == obj)
    return true;

  if (!(obj instanceof Circle))
    return false;

  Circle c1 = (Circle) obj;
  return Double.compare(c1.getRadius(), this.radius) == 0;
}

  public Circle() {
  }

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
  public double CircleArea() {
    return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius))
        .multiply(BigDecimal.valueOf(Math.PI))
        .doubleValue();
  }
}