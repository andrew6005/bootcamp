public class InvalidNameException extends RuntimeException{

  public static void main(String[] args) {
    String firstname ="John";
    String lastname ="Lau";
    boolean signup = false;
  }

  public static void checkfirstname(String firstname, String lastname){
    if(!isValidfirstname(firstname)){
      throw new InvalidNameException();

    }
    


  }
  public static boolean isValidfirstname(String firstname){
    return false;
  }
  public static boolean isValidlastname(String lastname){
    return false;
  }

  
  
}
