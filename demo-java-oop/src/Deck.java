import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] cards;

    public Deck() {
        this.cards = new Card[13 * Suite.values().length];
        int idx = 0;
        for (int i = 1; i <= 13; i++) {
            for (Suite suite : Suite.values()) {
                this.cards[idx] = new Card(i, suite);
                idx++;
            }
        }
    }

    public Card[] getCards() {
        return this.cards;
    }

    public void shuffle() {
        Random rand = new Random();

        for (int i = this.cards.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = this.cards[i];
            this.cards[i] = this.cards[j];
            this.cards[j] = temp;
        }
    }
    public Card[] deal5Cards(){
        //Random rand2 = new Random();
       
        Card[] hand = new Card[5];
        for(int i = 0;i < 5 ;i++){
            
            this.cards= new Card[5];
            //new Card(i, rand2);

        }
        return hand;
    }

    public static void main(String[] args) {
        Deck d1 = new Deck();

        System.out.println("Before shuffle:");
        System.out.println(Arrays.toString(d1.getCards()));

        d1.shuffle();

        System.out.println("After shuffle:");
        System.out.println(Arrays.toString(d1.getCards()));
    }
}
