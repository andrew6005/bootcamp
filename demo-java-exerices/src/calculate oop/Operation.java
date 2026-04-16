public abstract class Operation {

protected double a;
    protected double b;

    public Operation(double a, double b) {
        this.a = a;
        this.b = b;
    }


  public class Main {
    public static void main(String[] args) {
        Add add = new Add(20, 10);
        Subtract sub = new Subtract(40.5, 10);
        Multiply mul = new Multiply(2.9, 10);
        Divide div = new Divide(20, 10);

        System.out.println("Add: " + add.calculate());
        System.out.println("Subtract: " + sub.calculate());
        System.out.println("Multiply: " + mul.calculate());
        System.out.println("Divide: " + div.calculate());
    }
}

}
