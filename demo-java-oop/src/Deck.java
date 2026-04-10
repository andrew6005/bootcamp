public class Deck {
  private Card[] cards;

  public Deck(){
    this.cards = new Card[13*Suite.values().length];
    int idx =0;
    for(int i =1; i<=13;i++){
      for(Suite suite : Suite.values()){
      this.cards[idx] = new Card(i, suite);
      idx++;

      }

    }
  }
public Card[] getCards() {
  return this.cards;
}


public static void main(String[] args) {
  Deck d1= new Deck();
  Card[] card = d1.getCards();
  for(int i =0 ; i < card.length;i++){
    System.out.println(card[i].getRank()+""+card[i].getSuite());


  }
  //* class -> 5 cards Boolean



}
}
