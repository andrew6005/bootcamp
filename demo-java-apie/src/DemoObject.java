public class DemoObject {
  public static void main(String[] args) {
    //*top most class - object
    Object o1 = new Object();
    //! Object is the parent of all class in java
    Object o2 = new Cat();
    Object o3 = new Superman();
    Object o4 = new Circle(3.5);

    //o2.getClass().getMethod( "Cat",Cat.class);

   // String 

   
    System.out.println( o2.getClass().getSuperclass());
    System.out.println(o3.getClass().getSuperclass());
    System.out.println(o4.getClass().getSuperclass());

/* for(int i =0; i< nums.length - 1;i++){
           for(int j =0; j< nums.length; j++){
            if(nums [i]+nums[j]== target){
                return new int[]{i,j};
            }
           }
        }
        return new int[0];
*/
}
}
