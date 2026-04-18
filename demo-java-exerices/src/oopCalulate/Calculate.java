public abstract class Calculate {
    private double a;
    private double b;

    public Calculate(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public abstract double calculate();


    public static void main(String[] args) {
        Calculate add = new Plus(10.8, 5);
        Calculate sub = new Subtract(14.6, 5);
        Calculate multi = new Multi(123.6, 5);
        Calculate divide = new Divide(1123.5, 5);
        Calculate divideZero = new Divide(1230.6, 0);

        System.out.println("Plus" + add.calculate());
        System.out.println("Subtract" + sub.calculate());
        System.out.println("Multi" + multi.calculate());
        System.out.println("divide" + divide.calculate());
        System.out.println("divide" + divideZero.calculate());
    }



}