public class DemoMethod {

  //! static(non OOP presentation)
  //
  public static void main(String[] args) {
    //1+3=4
    System.out.println(sum(1, 3));
    //sum2
    DemoMethod dm = new DemoMethod();// create instance
    System.out.println(dm.sum2(1, 3));

  

    
  }

  public static int sum(int a ,int b){
    return a+b;
  }

//* 
  public int sum2 (int x,int y){
    return x+y;
  }
}
