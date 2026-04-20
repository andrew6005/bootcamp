public class DemoException {
  public static void main(String[] args) {
    String s ="Hello";
    System.out.println(s.charAt(0));
    s = null;
   //System.out.println(s.charAt(1));

    if(s !=null){
      System.out.println(s.charAt(0));
    }else{
      System.out.println("null");
    }

    String []arr = new String[3];
    System.out.println(arr[3]);
    System.out.println(arr[-1]);
        System.out.println(arr[3]);
  
  String t = "100.9";
boolean isNumber = false;
//*try catch
  
  
  //double d10 =100.9;
  try{
    double d10 = Double .valueOf(t);
    isNumber = true;
  }catch (NumberFormatException e){
     isNumber = false;

  }

  //Exception


}

}
//!unchecked exeption(Run time EXception)
//!checked eception(Complie thime exception)