package EX1;
//!fianl (cannot be assigned after construtor)
public class Sword extends Wapon{
  private  final Type type;
  private int level;

public Sword(Type type){
  this.type = type;

}




public static Sword ofDONRAN(){
  return new Sword(Type.DORAN);
}

public static Sword ofHEXDRIKER(){
  return new Sword(Type.HEXDRINKER);
}
public Sword.Type getType(){
  return this.type;
}



public static enum Type{
DORAN, HEXDRINKER;
}

private int pa;

private void Type(int pa){
  this.pa = pa;

}
public int getpa(){
  return this.pa;
}


  
}


