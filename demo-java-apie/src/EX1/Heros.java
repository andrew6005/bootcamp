package EX1;

public class Heros {
  public static int[][] maxhpArr = new int[] []{
    {100,200,300,400,500},
      {100,200,300,400,500},
        {100,200,300,400,500}
  };

  public static int getMaxHP(Role role, int level){
     switch (role) {
      case Warrior:
        return maxhpArr[0][level-1];
       
    
      case Archer:
        return maxhpArr[1][level-1];
       
        case Mage:
          return maxhpArr[2][level-1];
          default:
            return 0;
    }

  }
}
