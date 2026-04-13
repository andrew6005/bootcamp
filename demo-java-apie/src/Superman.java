//interface
public class Superman extends Human implements flyable , Swimable{
  private int hp;
  private int attackValue;
  @Override
  public void fly(){
    System.out.println("superman is flying");
  }
  public void sleep(){
    System.out.println("superman is Sleeping");
  }
  @Override
  public void swim(){
    System.out.println("superman is swiming");
  }

  public Superman(){
    this.hp=100;
    this.attackValue=5;
  }
  public void attack(Superman superman){
    if(this.isAlive()){
    superman.deducthp(this.attackValue);
}else{System.out.println("you die areadly. cannot alive");

}

  }


  
  public boolean isAlive(){
    return this.hp<=0;
  }
  public void deducthp(int tobededucthp){
    if(this.hp >= tobededucthp){
      this.hp =tobededucthp;
    }else{
      this.hp = 0;
    }
    
  }

  public int getHp(){
    return this.hp;
  }
 
  public static void main(String[] args) {
    /*Superman s1 = new Superman();
    //s1.sleep();
    //s1.fly();
    s1.deducthp(100);
    System.out.println(s1.isAlive());
    //s1.deducthp(4);
    //System.out.println(s1.isAlive());

    Superman s2 = new Superman();
    s1.attack(s2);
    s2.deducthp(100);
    System.out.println(s2.isAlive());
    System.out.println(s2.getHp());*/
    Superman s3 =new Superman();

    s3.setName("john");
    //super();
  System.out.println(s3.getClass().getName());


    

  }

}