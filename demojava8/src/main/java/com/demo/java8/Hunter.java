package com.demo.java8;

public class Hunter {
  
private Gun gun;
private boolean isAlive;

// public Gun(){
//   this.Bullet=0;
// }
public Hunter(Gun gun){
  if(gun == null)
    throw new IllegalArgumentException("gun must be ready.");
  this.gun = gun;
  this.isAlive = true;
}
public void Shoot(Hunter hunter){
  try{
  this.gun.shoot();
  hunter.dead();
  }catch(RuntimeException e){
    return;
  }
  
}
public void dead(){
    this.isAlive = false;

  }
 
  public boolean addbullet(){
    //return false;
     return this.gun.addBullet();
  }

public static void main(String[] args) {
  // Hunter h1 = new Hunter(new Gun());
  // Hunter h2 = new Hunter(new Gun());

  // h1.addbullet();
  // h1.Shoot(h2);
  // System.out.println(h1);
  // System.out.println(h2);

  
}
public void isAlive() {
  
}



  
}
