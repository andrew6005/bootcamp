public class DemoMethod {

  //! static(non OOP presentation)
  //* 

  private static double  pi = 3.14;
  public static void main(String[] args) {
    //1+3=4
    System.out.println(sum(1, 3));
    //sum2
    DemoMethod dm = new DemoMethod();// create instance
    System.out.println(dm.sum2(1, 3));
    System.out.println(DemoMethod.hoursperyear());
     System.out.println(hoursperyear());


  

    
  }
  private static int dayperyear= 365;
private static int hoursperday= 24;

public static int hoursperyear(){
  return dayperyear * hoursperday;
    
}



  public double getpi(){
    return DemoMethod.pi;
    
  }
  public static int sum(int a ,int b){
    return a+b;
  }


//* 
  public int sum2 (int x,int y){
    return x+y;
  }



}
