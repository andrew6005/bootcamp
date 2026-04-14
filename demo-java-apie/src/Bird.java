import java.text.BreakIterator;

public class Bird {
  private String name;
  private int code;
  public int getCode(){
    return this.code;
  }
  public int setCode(){
    return this.code=code;
  }
  public Bird(){

  }

  
  public Bird(String string, int i) {
    this.code=code;
    this.name=name;
  }
  public static void main(String[] args) {
   Bird b1 = new Bird();
   Bird b2 = new Bird();
   System.out.println(b1.equals(b2));
   Bird b3 = new Bird("john",101);
   Bird b4 = new Bird("john",102);
   System.out.println(b3.equals(b4));
   Bird b5 = new Bird("Mary",103);
   Bird b6 = new Bird("Mary",104);
    System.out.println(b5.equals(b6));
    Double d10 =new Double ("10.0");
    Double d11 = Double.valueOf(10.0);
    System.out.println(d10.equals(d11));
   /*  Baby b1 = new Baby("John Chan", 65321);
    Baby b2 = new Baby ("John chan ",65321);
    System.out.println(b1.equal(b2));// true*/

  }
  //* part 1 memory Addresss same ->same memory object -> same thing
  @Override
  public boolean equals(Object obj){
    if(this== obj){
      return true;


    }//* Part2 instanceof to check object vs type
    if(!(obj instanceof Bird)){
        return false;
    }//* part3 compare 2 bird objects
    Bird b1 = (Bird)obj;
    return b1.getCode()== this.code; //
  }
  public void fly(){
    System.out.println("bird is flying");
  }


  
}
