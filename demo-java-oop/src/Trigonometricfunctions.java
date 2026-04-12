import java.math.BigDecimal;
import java.math.RoundingMode;

public class Trigonometricfunctions {
  private double Hypotenuse;
  private double Opposite;
  private double Adjacent; 

  public double getHypotenuse() {
    return this.Hypotenuse;
  }

  public void setHypotenuse(double Hypotenuse) {
    this.Hypotenuse = Hypotenuse; 
  }

  public double getOpposite() {
    return this.Opposite;
  }

  public void setOpposite(double Opposite) {
    this.Opposite = Opposite; 
  }

  public double getAdjacent() {
    return this.Adjacent;
  }

  public void setAdjacent(double Adjacent) {
    this.Adjacent = Adjacent; 
  }

  public BigDecimal sine() {
    return BigDecimal.valueOf(this.Opposite)
        .divide(BigDecimal.valueOf(this.Hypotenuse), 10, RoundingMode.HALF_UP);
  }

  public BigDecimal cosine() {
    return BigDecimal.valueOf(this.Adjacent)
        .divide(BigDecimal.valueOf(this.Hypotenuse), 10, RoundingMode.HALF_UP);
  }

  public BigDecimal tangent() {
    return BigDecimal.valueOf(this.Opposite)
        .divide(BigDecimal.valueOf(this.Adjacent), 10, RoundingMode.HALF_UP);
  }

  public static void main(String[] args) {
    Trigonometricfunctions t1 = new Trigonometricfunctions();
    t1.setHypotenuse(15.7);
    t1.setOpposite(35.4);
    t1.setAdjacent(86.2);

    System.out.println(t1.sine());
    System.out.println(t1.cosine());
    System.out.println(t1.tangent());
  }
}