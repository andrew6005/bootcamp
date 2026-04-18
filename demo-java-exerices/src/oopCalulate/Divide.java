public class Divide extends Calculate {

    public Divide(double a, double b) {
        super(a, b);
    }

    @Override
    public double calculate() {
        if (getB() == 0) {
            System.out.println("Error: cannot divide by zero.");
            return 0;
        }
        return getA() / getB();
    }
}