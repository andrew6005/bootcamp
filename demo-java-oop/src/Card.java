public class Card {
  //rank
  //suite

  private int rank; //* 1,2,3,4,5,6,7,8,9,10,J,Q,K
  private Suite suite;//* DIAMOND, CLUB, HEAT, SPADE
  public Card(int rank , Suite suite){
    this.rank=rank;
    this.suite =suite;



  }

  public int getRank(){
    return this.rank;
  }
  public Suite getSuite(){
    return this.suite;
  }

  public static void main(String[] args) {
    
  }

  

  

  
}
