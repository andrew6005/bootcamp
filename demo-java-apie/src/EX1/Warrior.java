package EX1;
public class Warrior extends Hero {
  

  public void attack(Hero target){
    int toBededucted =this.getpa();
    target.deductHP(toBededucted);
    if(!target.isAlive());{
      super.addExp(5);
      if(super.getHP()>=100){
        this.levelup();

      }

    }
  }
  public void addDoran (){

  }
  
  public  void deductHP(int toBededucted){
    if(toBededucted >super.getHP()){
      super.setHP(0);


    }else{
      super.setHP(super.getHP() - toBededucted);
    }
  
  }
  
  @Override
  public int getpa(){
    double cc = Heros.getCC(Role.Warrior,super.getlevel());
    boolean iscd =Math.random()<cc;
    int basePa =  Heros.getCd(Role.Warrior,super.getlevel());
    int cd = 0;
   // boolean iswithrapon = super.getWapons()
    if(iscd){
        cd+=Heros.getCd(Role.Warrior,super.getlevel());
    }
    return basePa + cd;
   
  }






  @Override
  public void levelup(){
    super.levelup();
    int maxHp= Heros.getMaxHP(Role.Warrior , super.getlevel());
    super.setHP(maxHp);
    
  }

 


  public Warrior(String name){
    super(name);
    int maxHp = Heros.getMaxHP(Role.Warrior,super.getlevel());
    super.setHP(maxHp);
    
    
   


  }


  public static void main(String[] args) {
   
   

  }

  @Override
  void attack() {
   
  }






   

}