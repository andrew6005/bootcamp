import java.util.Arrays;

public class DemoMath {
  

  //! pow 
  public static void main(String[] args) {
    double result = Math.pow(2,3); // implicit promomtion
    System.out.println(result);
    double bmi =76/Math.pow(1.76,2);
    System.out.println(bmi);
    //!pi
    double pi =Math.PI;
    double radius  = 3.5;
    double area = radius *radius*pi;
    System.out.println(area);
    //!round
    System.out.println();

    //! abs
    int x = -2; //2/-2
    if(x<0){
      x=x*-1;

    }
    System.out.println(x);
    int y= -3;
    System.out.println(Math.abs(y));

    //!max/min
    int[] arr= new int[]{10,4,8,99,-2};
    for(int i = 0;i < arr.length;i++){
      int max = arr[0];
      int min = arr[0];
      if(arr[i]>max){
        max= Math.max(arr[i],max);
        min= Math.min(arr[i],min);
        

      }

      System.out.println(max);
      System.out.println(min);
    }
    
    

    //!floor, cell
    System.out.println(Math.floor(10.9));
    System.out.println(Math.ceil(10.1));

    //
    double number = Math.random();//0-1
    System.out.println(number);
    //100-1100
    //(Math.random()*100)+1000;

    //1-49(ramdom)
    //output: int[]-> 6 number(marksix)(no duplicate)
    


        int[] numbers = new int[6];
        int count = 0;

        while (count < 6) {
            int num = (int)(Math.random() * 49) + 1;

            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                numbers[count] = num;
                count++;
            }
        }

        Arrays.sort(numbers);

        System.out.println("六合彩隨機號碼：");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }





  }
}