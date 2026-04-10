import java.time.LocalDate;

public class customer {
  private String firstname;
  private String lastname;
  private char gender;
  private LocalDate dob;
  private String[] orderNo;

  public customer() {
  }

  public customer(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  public customer(String firstname, String lastname, char gender, LocalDate dob) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.gender = gender;
    this.dob = dob;
  }

  public static void main(String[] args) {
    customer c1 = new customer();
    customer c2 = new customer("john", "chan", 'M', LocalDate.of(1990, 1, 1));
    customer c3 = new customer("Leo", "Lau");
  }
}