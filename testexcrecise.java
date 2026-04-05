import java.security.SecureRandom;
import java.util.Scanner;

public class testexcrecise{
  public static void main (String  [] args){
    //use for loop  find event number  1 t 100

    /*int sum = 0;

    for(int i = 0;i<=100;i++){
        if(i%2==0){
              sum +=i;
                

        }
      
    }

      System.out.println("the sum of even number is "+ sum);


      //1-100 find number can devided by 3 and 5 and the sum

      for(int i =0;i<=100;i++){
        if(i % 3==0 && i%5==0){
          sum =sum +i;
        }


      }
      System.out.println("the sum of numbers divisible by 3 and 5 is "+ sum);*/


      /*for(int i=0;i<=100;i++){
        if( i%2!=0&& i%3!=0&& i%5!=0&& i%6!=0 &&i%7!=0 &&i%8!=0 &&i%9!=0 &&i%10!=0){
        System.out.println(i);
          

        }
        //System.out.println(i);
      }*/



        /*Scanner scanner = new Scanner(System.in);
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        SecureRandom random = new SecureRandom();

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        String password = "";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            password += chars.charAt(index);
        }

        System.out.println("Generated Password: " + password);

        scanner.close();*/

   for (int i = 2; i <= 100; i++) {
    boolean isPrime = true;

    for (int j = 2; j < i; j++) {
        if (i % j == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) {
        System.out.println(i);
    }
}

          
         
          
  }
}
