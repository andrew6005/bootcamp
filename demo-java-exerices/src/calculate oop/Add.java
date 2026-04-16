public class Add extends Operation {
 public Add(double a, double b) {
        super(a, b);
    }

    public double calculate() {
        return this.a + this.b;
    }
}
