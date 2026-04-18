import java.math.BigDecimal;

public abstract class Calculate {
    private BigDecimal a;
    private BigDecimal b;

    public Calculate(BigDecimal a, BigDecimal b) {
        this.a = a;
        this.b = b;
    }

    public BigDecimal getA() {
        return this.a;
    }

    public BigDecimal getB() {
        return this.b;
    }

    public abstract BigDecimal calculate();

    public static void main(String[] args) {

        Plus plus = new Plus(
            BigDecimal.valueOf(128.8),
            BigDecimal.valueOf(355.7)
        );

        Subtract subtract = new Subtract(
            BigDecimal.valueOf(3238.8),
            BigDecimal.valueOf(1283.8)
        );

        Multi multi = new Multi(
            BigDecimal.valueOf(3238.8),
            BigDecimal.valueOf(1283.8)
        );

        Divide divide = new Divide(
            BigDecimal.valueOf(3238.8),
            BigDecimal.valueOf(1283.8)
        );

        Divide divideZero = new Divide(
            BigDecimal.valueOf(3238.8),
            BigDecimal.ZERO
        );

        System.out.println("Plus: " + plus.calculate());
        System.out.println("Subtract: " + subtract.calculate());
        System.out.println("Multi: " + multi.calculate());
        System.out.println("Divide: " + divide.calculate());
        System.out.println("DivideZero: " + divideZero.calculate());
    }
}