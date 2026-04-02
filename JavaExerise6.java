public class JavaExerise6 {
  // Sum values of an array
  public static void main(String[] args) {
     // Print the numbers fulfill the below criteria:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. First ten numbers
    //int sum = 0;
    int count = 0;
    for (int i = 0; i < 100; i++) {
      // code here ...
      //int index = 10;
      if(i%2==0 && i %3==0 && count < 10){
        count++;
        System.out.println(i);
      } 
        
      
        
        

      
    }
  }
}