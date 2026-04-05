public class testexcrecise{
  public static void main (String args){
    //use for loop  find event number  1 t 100

    int sum = 0;

    for(int i = 1;i<=100;i++){
        if(i%2==0){
            sum =sum +1;
        }

    }
    System.out.println("the sum of even number is "+sum);
  }
}