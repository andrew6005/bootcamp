public enum Direction {
  EAST(1,"East"),SOUTH(2,"South"),WEST(3,"West"),NORTH(4,"North");
  private int value;
  private String desc;
  
  private Direction(int value,String desc){
    this.value=value;
  }
  

  public int getValue(){
    return this.value;
  }
  public String getDesc(){
    return this.desc;
  }

  public void setvalue(int value){
    this.value = value;
  }
 
  public Direction oppsite(){
    //*for each loop
    for(Direction d: Direction.values()){
    if(this.value * -1 ==d.getValue()){
      return d;


    }
   System.out.println(d.getDesc());
    


}


  return null;
  }

  public static void main(String[] args) {
    Direction d1 =  Direction.SOUTH;
    System.out.println(d1.getValue());
    System.out.println(Direction.SOUTH.getValue());
  for(Direction d: Direction.values()){
    System.out.println(d.getDesc());
    }
    System.out.println(Direction.NORTH.oppsite());
        for(Direction d: Direction.values()){
    /*if(this.value * -1 ==d.getValue()){
      return d;


    }*/
   System.out.println(d.getDesc());
    


}

    int []arr = new int[]{4,9,-5};
    for(int i = 0; i<arr.length;i++){//flexible to control iteration
        System.out.println(arr[i]);
    } 
    //Loop through all elemnets
    for(int x :arr){
      System.out.println(x);

    }
    Direction.EAST.setvalue(100);
    System.out.println(EAST);
  }
}
