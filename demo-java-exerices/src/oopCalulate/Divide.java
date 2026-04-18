import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divide extends Calculate {

    public Divide(BigDecimal a, BigDecimal b) {
        super(a, b);
    }

    @Override
    public BigDecimal calculate() {
        if (getB().compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("Error: cannot divide by zero.");
            return BigDecimal.ZERO;
        }
        return getA().divide(getB(), 2, RoundingMode.HALF_UP);
    }
}