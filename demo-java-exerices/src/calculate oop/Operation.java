//import java.math.BigDecimal;

public abstract class Operation {

    protected int a;
    protected int b;

    public Operation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Add add = new Add(9, 8);
        Subtract sub = new Subtract(8, 9);
        Multiply mul = new Multiply(9, 10);
        Divide div = new Divide(9, 10);

        System.out.println("Add: " + add.calculate());
        System.out.println("Subtract: " + sub.calculate());
        System.out.println("Multiply: " + mul.calculate());
        System.out.println("Divide: " + div.calculate());
    }
}


