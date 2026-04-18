public class Subtract extends Calculate {

    public Subtract(double a, double b) {
        super(a, b);
    }

    @Override
    public double calculate() {
        return getA() - getB();
    }
}