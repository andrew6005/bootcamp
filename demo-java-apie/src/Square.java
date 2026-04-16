public class Square extends Shape {
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}