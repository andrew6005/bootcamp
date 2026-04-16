public class Divide extends Operation {

    public Divide(double a, double b) {
        super(a, b);
    }

    public double calculate() {
        if (this.b == 0) {
            System.out.println("Error: cannot divide by zero.");
            return 0;
        }
        return this.a / this.b;
    }
}