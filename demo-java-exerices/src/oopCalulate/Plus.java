import java.math.BigDecimal;

public class Plus extends Calculate {

    public Plus(BigDecimal a, BigDecimal b) {
        super(a, b);
    }

    @Override
    public BigDecimal calculate() {
        return getA().add(getB());
    }
}