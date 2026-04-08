public class primitivesmath {
  public static void main(String[] args) {

    //java  int value *int value -> int value
    //assign int value innto varviable (ok)
    int count = 3;
    int price = 10;
     int total = count * price;

     //System.out.println(total);

     int totalscore = 750;
     int people = 8;
     int average = totalscore / people;
     System.out.println(average);

      

     double average2 = totalscore / people;
     System.out.println(average2);//93->93.0

    byte b2 = - 128;
    System.out.println(b2-3);
//()= I take my own risk
    b2=(byte) (b2 -3);
    System.out.println(b2);//125(over)

int amount = 2_100_000_000;

amount = amount +1_000_000_000;
System.out.println(amount); 

amount =2100000000;
long newamount = amount + 100_000_000L;
System.out.println(newamount);




/*long a1 = 2_100_000_000;

a1 = (long) (a1 + 100_000_000);
System.out.println(a1);*/



  }
}