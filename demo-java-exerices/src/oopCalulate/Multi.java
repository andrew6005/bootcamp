import java.math.BigDecimal;

public class Multi extends Calculate {

    public Multi(BigDecimal a, BigDecimal b) {
        super(a, b);
    }

    @Override
    public BigDecimal calculate() {
        return getA().multiply(getB());
    }
}