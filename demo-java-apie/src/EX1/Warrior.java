package EX1;
public class Warrior extends Hero {
  //cc, cd 


  public int getpa(){

    return 
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
   

}
