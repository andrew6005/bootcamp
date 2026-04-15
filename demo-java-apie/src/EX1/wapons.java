package EX1;

public class wapons {
    public static int[][] maxhpArr = new int[] []{
    {100,200,300,400,500},
      {100,200,300,400,500},
        {100,200,300,400,500}
  };
   public static double[][] paArr = new double[] []{
    {0.05,0.1,0.15,0.2,0.25},
      {0.05,0.1,0.15,0.2,0.25},
        {0.05,0.1,0.15,0.2,0.25}
  };

     public static int[][] cdArr = new int[] []{
    {30,40,50,60,70,80},
      {30,40,50,60,70,80},
        {30,40,50,60,70,80}
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
    public static double getCC(Role role, int level){
     switch (role) {
      case Warrior:
        return paArr[0][level-1];
       
    
      case Archer:
        return paArr[1][level-1];
       
        case Mage:
          return paArr[2][level-1];
          default:
            return 0;
    }

  }

    public static int getCd(Role role, int level){
     switch (role) {
      case Warrior:
        return cdArr[0][level-1];
       
    
      case Archer:
        return cdArr[1][level-1];
       
        case Mage:
          return cdArr[2][level-1];
          default:
            return 0;
    }

  }
  
}
