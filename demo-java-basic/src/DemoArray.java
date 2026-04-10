import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    int age = 3;
    int johnage = 18;
    int maryage = 20;

//array: store a set of same type values
//Memory
//Array is unit in memory
int[] ages = new int[3];
//first box
ages[0] = age; //assign 10 in to first box
ages[1] = johnage; //assign 18 in to second box
ages[2] = maryage; //assign 20 in to third box 
System.out.println(ages[0]);
System.out.println(ages[1]);
System.out.println(ages[2]);

//swap johnage and maryage
int temp = ages[1];
ages[1] = ages[2];
ages[2] = temp;
System.out.println(ages[0]);
System.out.println(ages[1]);
System.out.println(ages[2]);

for(int i=0; i<ages.length; i++){ //0,1,2
  System.out.println(ages[i]);
  //System.out.println(ages[3]); error
}
  int [] arr = new int [100];

  for(int i = 0; i<arr.length; i++){
    System.out.println(arr[i]);


  }
  for(int i = 0; i<arr.length; i++){
    arr[i]= i+100; 
    System.out.println(arr[i]);
}
//two to declare an arry

  char[] chs = new char[4];
  chs[0] = 'a';
  chs[1] = 'b';
  chs[2] = 'c';
  chs[3] = 'd';
  double[] prices = new double[]{99.99,50.3,100.0};

  for(int i = 0; i<prices.length; i++){
    System.out.println(prices[i]);
}
    //sum up all the prices
    double total = 0.0;
    for(int i = 0; i<prices.length; i++){
      total += prices[i];
      
      
      
    }
    System.out.println("total=" + total);

    //find min price
    double min = prices[0];
    for(int i=0 ;i<prices.length; i++){
      if(prices[i] < min){
        min = prices[i];
      }
    }
    System.out.println("min=" + min);

    //find max price
    double max = prices[0];
    for(int i=0 ;i<prices.length; i++){
      if(prices[i] > max){
        max = prices[i]; 
      }   
    }
      System.out.println("max=" + max);

      //int [], double[],string[],char[],
      char[] chs2 = new char[]{ 'a', 'e', 'i', 'o', 'u' };
      String name = "Mary";
      //loop;check if name contains 'a'
      boolean found = false;
      for(int i = 0; i<name.length(); i++){
        
        if(name.charAt(i) == chs2[0] || name.charAt(i) == chs2[1] || name.charAt(i) == chs2[2] || name.charAt(i) == chs2[3] || name.charAt(i) == chs2[4]){
          found = true;
          break;

        }
      }
      System.out.println("found=" + found);

      //outer loop and inner loop
       found = false;
      for(int i= 0 ;i < name.length();i++){ // outer loop (every char in the name)
          for(int j=0;j< chs2.length; j++){ //  innter every char in the chs2
            if(name.charAt(i) == chs2[j]){
              found = true;
              break;// break innter loop
            }
            

          }
          if(found){
            break; // break outer loop

          }
         
      }
      System.out.println("found2=" + found);

      //
      int [] arr2 =new int[]{100,4,99,55,17};// mov e the number ->4,99,55,17,100
      for(int i =0;i <arr2.length-1;i++){
        /*if(arr2[0]==100&& arr2[1]==4&& arr2[2]==99&& arr2[3]==55&& arr2[4]==17){
            arr2[i]=arr2[i+1];
        }*/
        //arr2[0]+= 1;
        int backup = arr2[i];
          arr2[i]=arr2[i+1];
          arr2[i+1]=backup;
         
}
      System.out.println(Arrays.toString(arr2));
      int[] arr3 = new int[]{100,4,200,55,17};
      for(int i =0;i <arr3.length-1;i++){
        int backup = arr3[i];
          
          if(arr3[i] > arr3[i+1]){
            backup = arr3[i];
            arr3[i]=arr3[i+1];
            arr3[i+1]=backup;

          }

          }
          
      
    
    System.out.println(Arrays.toString(arr3));

          //sorting
          //4,55,17,100,200


          int[] arr4 = new int[]{100,4,200,55,17};

          for(int i =0 ; i<arr4.length-1; i++){
            if(arr4[i]>arr4[i+1]){
              int backup = arr4[i];
              arr4[i]=arr4[i+1];
              arr4[i+1]=backup;

            }
            for(int j = 0 ; j<arr4.length-1-i; j++){//0,1,2,3 (how many times the max number move to the end)
              if(arr4[j]>arr4[j+1]){//(how many moves you need for max number)
                int backup = arr4[j];
                arr4[j]=arr4[j+1];
                arr4[j+1]=backup;

              }

            }
          }
            
            

          System.out.println(Arrays.toString(arr4));

          String str ="abcdefg";
          //reverse the string
          //gfedcba

            for(int i= str.length()-1;i>=0;i--){
                String revString = "";
                revString += str.charAt(i);
                System.out.println(revString);
            }
              //System.out.print("resv=" + revString);
              double maxprice = prices[0];
              for(int i =0; i<prices.length;i++){
                
              }
        



      }
     
}
