package EX1;

public class Mage extends Hero {
  public Mage(String name) {
    super(name);
     int maxHp = Heros.getMaxHP(Role.Mage,super.getlevel());
    super.setHP(maxHp);
    
  }
   @Override
  public void levelup(){
    super.levelup();
    int maxHp= Heros.getMaxHP(Role.Mage , super.getlevel());
    super.setHP(maxHp);
    
  }
   @Override
   int getpa() {
    return 0;
  
   }
   @Override
   void attack() {
    
   }
   @Override
   void deductHP(int toBededucted) {
   
   }

 
 
  
  

}
