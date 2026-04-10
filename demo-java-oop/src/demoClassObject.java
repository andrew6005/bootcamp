public class demoClassObject {
  public static void main(String[] args) {
    String phonenumber = "852 12345678";
    String emailaddress = "vicentlau@gmail.com";
    String wechaID= "vicentlau";
    String whatappnumber = "852 12345678";

    String[] tutor  = new String[]{"852 12345678", "vicentlau@gmail.com", "vicentlau", "852 12345678"};
    //disadvantage: read dtat form developer, perspectuve

   Tutor t1 = new Tutor();//produce an object of class Tutor
    //t1 = Big box
    t1.setEmailAddress("sally@gmail.com");

    Tutor t2 = new Tutor();
    t2.setEmailAddress("leolau@gmail.com");

    String t2Email = t2.getEmailAddress();
    System.out.println(t2Email);
    System.out.println(t1.getEmailAddress());
  }
}
