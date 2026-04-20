public class InvalidEmailException  extends RuntimeException{//! unchecked Exception

  //* public class InVidEmailException extends Exception.      //! Checked Expecption

  public static void main(String[] args) {
    //new InvalidEmailException();
    boolean isSignUP = true;
    String userEmail = "abc@gmail.com";
    if(isSignUP){
      try{
        sendWelcomeEmail(userEmail);

      }catch (InvalidEmailException e){
        sendSMS();

      }
    }
    //* if cannot recover, return status back to trigger point (Frontend)


  }
  //!"return" - >does not present any problem
  //!throw(return) execption object


  private static void sendSMS() {
    
  }


  public static void sendWelcomeEmail(String  emailAddress){
    if(!isValidEmail(emailAddress)){
      throw new InvalidEmailException();

    }
    sendEmail(emailAddress, "Welcome to Bootcamp");
    //!"return;" -> does not present any problem

  }

  public static void sendEmail(String emailAddress, String emailSubject) {
    
  }
  public static boolean isValidEmail(String emailAddress){
    return false;
  }
  
}
