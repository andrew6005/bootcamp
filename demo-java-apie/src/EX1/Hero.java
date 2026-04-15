package EX1;
public abstract class Hero {
 private static int idCounter =0;
 private int level;
 private String name;
 private int id;
 private int exp;
 private int HP;

  private int MP;
  abstract int getpa();
  abstract void attack();
  private Wapon wapon;


  public Wapon getWapons(){
   return this.wapon = wapon;
   
  }

  public void equip(Wapon wapon){
   this.wapon=wapon;

  }
  public void removeWeapon(){
   this.wapon= null;

  }

 public Hero(String name){
    this.level=1;
    this.exp=0;
    this.id = ++idCounter;
    
 }
 public int getlevel(){
   return this.level;
 }
 public void levelup(){
  this.level++;
  
 }
 public void setHP(int HP){
   this.HP = HP;
 }
 public int getHP(){
   return this.HP;
 }
 public static void main(String[] args) {
  Hero h1 =  new Warrior("john") ;

   h1.levelup();
   Hero h2= new Warrior("tom");
   h2.equip(Sword.ofDONRAN());
   h2.removeWeapon();
  
      
   ;
  
 }
public boolean isAlive(){
   return this.HP>0;
}
public void addExp(int exp){
    this.exp += exp;
}
abstract void deductHP(int toBededucted);



}
