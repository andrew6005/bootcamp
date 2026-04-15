package EX1;

public class Demo2DArray {
  public static void main(String[] args) {
    int [][]arr= new int[2][3];
    arr[0][0]=100;
    arr[0][1]=100;
    arr[1][2]=100;

    arr[1][0]=100;
    arr[1][1]=100;
    arr[1][2]=100;

    int[][]arr2 = new int[][]{
      {100,100,100},
      {100,100,100},

    };

    for (int i = 0 ; i<arr2.length; i ++){
      for(int j = 0;j<arr2[i].length;j++){
        System.out.println(arr[i][j]);

      }

    }
      }
}
