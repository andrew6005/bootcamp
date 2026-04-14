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

  public void attack(Superman superman){
    if(this.isAlive()){
    superman.deducthp(this.attackValue);
}else{System.out.println("you die areadly. cannot alive");

}

  }
  public Superman(String name){
    super();
    this.hp=100;
    this.attackValue = 5;
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
    public Superman(){
    this.hp=100;
    this.attackValue=5;
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
    Superman s3 =new Superman("john");
    

    s3.setName("peter");
    //super();
  System.out.println(s3.getName());
  //! polymorphism

  Superman s4 = new Superman();
  Human h1 = new Superman();
  Human h2 = new Human();
  //h1= new Student();
  //h1.fly();
  //h1.swim();
  System.out.println(h1.getName());
  h1.setName("john");
  flyable f= new Superman("leo");
  f.fly();
  
  flyable[]fly = new flyable[]{new Superman(), new Superman("susan")};
  for(int i =0; i<fly.length;i++){
    fly[i].fly();

  }

  //*Static polymorphism
  //* call mothod Name(int x, int y), method name (double x , double,y)

  //*  Dynamic polymorphism(runtime decide method content)
  //* h1 -> Superan object (getname) or student object(getname) 

  


    

  }

}