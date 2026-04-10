public class Trigonometricfunctions {
  private double Hypotenuse;
  private double Opposite;
  private double Adjacent; 

  public double getHypotenuse(){
    return this.Hypotenuse;
  }
  public void setHypotenuse(double Hypotenuse){
    this.Hypotenuse = Hypotenuse; 
}

  public double getOpposite(){
    return this.Opposite;
  }
  public void setOpposite(double Opposite){
    this.Opposite = Opposite; 
}
  public double getAdjacent(){
    return this.Adjacent;
  }
  public void setAdjacent(double Adjacent){
    this.Adjacent = Adjacent; 
}
  public double sine(){
    return this.Opposite / this.Hypotenuse;
  }
  public double cosine(){
    return this.Adjacent / this.Hypotenuse;
  }
  public double tangent(){
    return this.Opposite / this.Adjacent;
  }

  public static void main(String[] args) {
    Trigonometricfunctions t1 = new Trigonometricfunctions();
    t1.setHypotenuse(15.7);
    t1.setOpposite(35.4);
    t1.setAdjacent(86.2);

    System.out.println(t1.sine());
    System.out.println(t1.cosine());
    System.out.println(t1.tangent());
  }
}