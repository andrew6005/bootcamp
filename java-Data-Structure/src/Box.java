public class Box<T> {
  private T x;
  public Box(T x){
    this.x=x;
  }
  public T getX(){
    return this.x;
  }
  public void setX(T x){
    this.x=x;
  }

  public static void main(String[] args) {
    Box<String> StringBox= new Box<>("hello");
    Box<Integer> integBox =new Box<>(10);
    Box<Cat> catBox = new Box<>(new Cat("john"));
  

  }
  //*1.less class  (Box <T>) atchieve same purpose
//*runtime -> Define Generic Type
//*T can be any type 

  
}
