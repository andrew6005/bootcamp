import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    //* java 8+ -> local date
    LocalDate ld1= LocalDate.of(2024,12,31);
    System.out.println(ld1);


    System.out.println(ld1.getMonthValue());
    System.out.println(ld1.getYear());
    System.out.println(ld1.getDayOfWeek());


    LocalDate today = LocalDate.now();
    System.out.println(today.getDayOfWeek());
    LocalDate joindate = LocalDate.now();
    LocalDate prLocalDate = joindate.plusMonths(3L);
    System.out.println(prLocalDate);

    LocalDate firstdayofyear = LocalDate.of(2026,1,1);
    LocalDate yearEnd = firstdayofyear.minusDays(1L);
    System.out.println(yearEnd);

    Month month = joindate.getMonth();
    System.out.println(month);

    if(prLocalDate.isBefore(LocalDate.of(2026,7,10))){
      System.out.println("yes.  before 2026-07-10" );

    }
    if(prLocalDate.isAfter(LocalDate.of(2026,7,1))){
      System.out.println("yes.  is after 2026-07-01");

    }
    System.out.println(LocalDate.of(2100,1,1).isLeapYear());
    System.out.println(LocalDate.of(2000,1,1).isLeapYear());
    System.out.println(joindate.isLeapYear());




  }
  
}
