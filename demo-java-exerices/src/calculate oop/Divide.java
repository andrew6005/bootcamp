

public class Divide extends Operation {

    public Divide(int a, int b) {
        super(a, b);
    }

    public int calculate() {
        if (this.b==0) {
            System.out.println("Error: cannot divide by zero.");
            
        }
        return this.a / this.b;
        //return this.a/this.b;


    }
}