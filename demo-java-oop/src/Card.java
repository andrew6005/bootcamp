import java.util.Random;

public class Card {
    private int rank;
    private Suite suite;
    public int length;

    public Card(int rank, Suite suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public Card(int i, Random rand2) {
      //TODO Auto-generated constructor stub
    }

    public int getRank() {
        return rank;
    }

    public Suite getSuite() {
        return suite;
    }

  @Override
  public String toString() {
    String r;
    switch (rank) {
        case 1: r = "A"; break;
        case 11: r = "J"; break;
        case 12: r = "Q"; break;
        case 13: r = "K"; break;
        default: r = String.valueOf(rank);
    }
    return r + " of " + suite;
}
}

/*public class Card {
  //rank
  //suite

  public static final String rand = null;
  private int rank; //* 1,2,3,4,5,6,7,8,9,10,J,Q,K
  private Suite suite;//* DIAMOND, CLUB, HEAT, SPADE
  public Card(int rank , Suite suite){
    this.rank=rank;
    this.suite =suite;



  }
  @Override
public String toString() {
    return this.rank + " " + this.suite;
}

  public int getRank(){
    return this.rank;
  }
  public Suite getSuite(){
    return this.suite;
  }

  public static void main(String[] args) {
    
  }*/

  

  

  

