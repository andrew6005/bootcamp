import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

public class Circle {
  private double radius;

  // constructor
  // ! Empty Contructor
  public Circle() {

  }

  public static boolean isDuplicated(int[]arr,int newNumber){
      for(int i =0 ; i<arr.length;i++){
        if(arr [i] == newNumber){
          return true;


        }

      }

    return false ;
  }

  // ! All Arguments Contructor (with all attribute)
  public Circle(double radius) {
    this.radius = radius;
  }

  // get, set
  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  // area
  // Presentation
  public double area() {
    return BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    // System.out.println(new Circle(3.5).area()); // 38.48451000647496

    Circle c1 = new Circle(); // default 0.0
    //System.out.println(c1.area()); // 0.0
    c1.setRadius(7.5);
    System.out.println(c1.area()); // 176.71458676442586

    int[] answer= new int [6];
    int idx = 0 ;
    int num = new Random().nextInt(49)+1;

    for(int i  = 0 ;i<10000000;i++){
    //while (idx <=5) {
    if(isDuplicated(answer, idx)){
            continue;

        }else{
          //int num = new Random().nextInt(49)+1;
          answer [idx++]= num;
          

        }
      
    

      
     

        return;
        }
        //answer[idx]= new Random().nextInt(49)+1;
        //idx++;
        //System.out.println(answer);
     /*if(idx >5){
    break;
  }*/
  
  //! while loop handles unceratin elapse timing for end loop

    //int num = new  Random().nextInt(49)+1;//*0-2 */
    //System.err.println();
    System.out.println(Arrays.toString(answer));
    //*Java Sorting
    //*bubble Sort inner loop , sort 100number -> 100^2 iterations
    //*  sort 100 number ->n*log n (log n <n)
    //* 
    Arrays.sort(answer);  //*  sort 100 number ->n*log n (log n <n)
    System.out.println(Arrays.toString(answer));

    
      }
  }




