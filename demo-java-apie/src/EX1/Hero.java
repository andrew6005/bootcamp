package EX1;
public abstract class Hero {
  private static int idCounter =0;
 private int level;
 private String name;
 private int id;
 private int exp;
 private int HP;

  private int MP;


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
  
 }
}
