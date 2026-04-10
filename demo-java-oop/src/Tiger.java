public class Tiger {
  private Color color;
  public Color getColor(){
    return this.color;


  }
  public Tiger (Color color){
    this.color = color;
  }
public void setColor(Color color){
  this.color=color;
}

 

 /*public getColor(){
  return this.getColor;
 }
 public setColor(){
  this.setColor = setColor; 
 }*/

  public static void main(String[] args) {
    Tiger t1 =new Tiger(Color.RED);
    if(t1.getColor()==Color.RED){

    }
  }
  
}
