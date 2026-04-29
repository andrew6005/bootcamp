import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class DemoNestedClass{

  //private static final String Name="jenny";
  private int x;
@AllArgsConstructor
@Getter
public class Ball{
  private int z;
  public int getValue(){
    return this.z + x;
  }
}



@AllArgsConstructor
@Getter
public static class NestedClass{
private int y ;
public  int getValue(){
  return this.y;
}
  }
  public static void main(String[] args) {
    NestedClass nc = new NestedClass(10);
    Ball b1 = new DemoNestedClass(20).new Ball(10);
    System.out.println(b1.getValue());
    DemoNestedClass nc2 =new DemoNestedClass(30);
    Ball b2 = nc2.new Ball(100);
    
  }
}