package com.demo.java8;

public class Gun {
  private int bullet;
  public Gun(){
    this.bullet=0;
  }
  public boolean addBullet(){
    if(this.bullet >=6)
      return false;
    this.bullet++;
    return true;
  }
  public void shoot(){
    if(this.bullet<=0)
      throw new RuntimeException("bullet");
    this.bullet--;
  }
  public int getBullet(){
    return this.bullet;
  }
}
