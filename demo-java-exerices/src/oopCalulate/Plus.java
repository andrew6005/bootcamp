public class Plus extends Calculate {

    public Plus(double a, double b) {
        super(a, b);
    }

    @Override
    public double calculate() {
        return getA() + getB();
    }
}