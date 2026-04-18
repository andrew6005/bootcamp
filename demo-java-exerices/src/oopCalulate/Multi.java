public class Multi extends Calculate {

    public Multi(double a, double b) {
        super(a, b);
    }

    @Override
    public double calculate() {
        return getA() * getB();
    }
}