import java.math.BigDecimal;

public class Subtract extends Calculate {

    public Subtract(BigDecimal a, BigDecimal b) {
        super(a, b);
    }

    @Override
    public BigDecimal calculate() {
        return getA().subtract( getB());
    }
}