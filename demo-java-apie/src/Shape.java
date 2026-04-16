public abstract class Shape {
    private double width;
    private double height;
    private Color color;

    public Shape() {
        super();
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Shape(double width, double height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
            //new Circle(3.5, Color.RED),
            //new Circle(4.6, Color.RED),
            new Square(5.9, Color.Red)
        };

        double sum = 0.0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }

        System.out.println("Total area = " + sum);
    }
}