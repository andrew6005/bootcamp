public class Multiply extends Operation {

    public Multiply(double a, double b) {
        super(a, b);
    }

    public double calculate() {
        return this.a * this.b;
    }
}