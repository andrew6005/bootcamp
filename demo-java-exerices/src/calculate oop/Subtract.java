import java.math.BigDecimal;

public class Subtract extends Operation {

    public Subtract(int a, int b) {
        super(a, b);
    }

    public int calculate() {
        return this.a - this.b;
       // return this.a.subtract(b);
    }
}