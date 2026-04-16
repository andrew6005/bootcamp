public class Subtract extends Operation {

    public Subtract(double a, double b) {
        super(a, b);
    }

    public double calculate() {
        return this.a - this.b;
    }
}