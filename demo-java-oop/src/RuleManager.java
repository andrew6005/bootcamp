import java.util.Arrays;

public class RuleManager<card> {

  public static int[] getSortedRanks(Card[] hand) {
    int[] ranks = new int[hand.length];
    for (int i = 0; i < hand.length; i++) {
      ranks[i] = hand[i].getRank();
    }
    Arrays.sort(ranks);
    return ranks;
  }

  

  public static boolean isOnePair(Card[] hand) {
    int[] ranks = getSortedRanks(hand);

    boolean case1 = (ranks[0] == ranks[1] &&
                     ranks[1] != ranks[2] &&
                     ranks[2] != ranks[3] &&
                     ranks[3] != ranks[4]);

    boolean case2 = (ranks[1] == ranks[2] &&
                     ranks[0] != ranks[1] &&
                     ranks[2] != ranks[3] &&
                     ranks[3] != ranks[4]);

    boolean case3 = (ranks[2] == ranks[3] &&
                     ranks[0] != ranks[1] &&
                     ranks[1] != ranks[2] &&
                     ranks[3] != ranks[4]);

    boolean case4 = (ranks[3] == ranks[4] &&
                     ranks[0] != ranks[1] &&
                     ranks[1] != ranks[2] &&
                     ranks[2] != ranks[3]);

    return case1 || case2 || case3 || case4;
  }

  public static boolean isTwoPair(Card[] hand) {
    int[] ranks = getSortedRanks(hand);

    boolean case1 = (ranks[0] == ranks[1] &&
                     ranks[2] == ranks[3] &&
                     ranks[1] != ranks[2] &&
                     ranks[3] != ranks[4]);

    boolean case2 = (ranks[0] == ranks[1] &&
                     ranks[3] == ranks[4] &&
                     ranks[1] != ranks[2] &&
                     ranks[2] != ranks[3]);

    boolean case3 = (ranks[1] == ranks[2] &&
                     ranks[3] == ranks[4] &&
                     ranks[0] != ranks[1] &&
                     ranks[2] != ranks[3]);

    return case1 || case2 || case3;
  }

  public static boolean isThreeOfAKind(Card[] hand) {
    int[] ranks = getSortedRanks(hand);

    boolean case1 = (ranks[0] == ranks[1] &&
                     ranks[1] == ranks[2] &&
                     ranks[2] != ranks[3] &&
                     ranks[3] != ranks[4]);

    boolean case2 = (ranks[1] == ranks[2] &&
                     ranks[2] == ranks[3] &&
                     ranks[0] != ranks[1] &&
                     ranks[3] != ranks[4]);

    boolean case3 = (ranks[2] == ranks[3] &&
                     ranks[3] == ranks[4] &&
                     ranks[0] != ranks[1] &&
                     ranks[1] != ranks[2]);

    return case1 || case2 || case3;
  }

  public static boolean isFourOfAKind(Card[] hand) {
    int[] ranks = getSortedRanks(hand);

    boolean case1 = (ranks[0] == ranks[1] &&
                     ranks[1] == ranks[2] &&
                     ranks[2] == ranks[3]);

    boolean case2 = (ranks[1] == ranks[2] &&
                     ranks[2] == ranks[3] &&
                     ranks[3] == ranks[4]);

    return case1 || case2;
  }

  public static boolean isFlush(Card[] hand) {
    Suite firstSuite = hand[0].getSuite();
    for (int i = 1; i < hand.length; i++) {
      if (hand[i].getSuite() != firstSuite) {
        return false;
      }
    }
    return true;
  }

  public static boolean isStraight(Card[] hand) {
    int[] ranks = getSortedRanks(hand);
    for (int i = 0; i < ranks.length - 1; i++) {
      if (ranks[i] + 1 != ranks[i + 1]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isFullHouse(Card[] hand) {
    int[] ranks = getSortedRanks(hand);

    boolean case1 = (ranks[0] == ranks[1] &&
                     ranks[1] == ranks[2] &&
                     ranks[3] == ranks[4] &&
                     ranks[2] != ranks[3]);

    boolean case2 = (ranks[0] == ranks[1] &&
                     ranks[2] == ranks[3] &&
                     ranks[3] == ranks[4] &&
                     ranks[1] != ranks[2]);

    return case1 || case2;
  }

  public static boolean isStraightFlush(Card[] hand) {
    return isStraight(hand) && isFlush(hand);
  }

  public static String checkHandType(Card[] hand) {
    if (isStraightFlush(hand)) {
      return "同花順";
    } else if (isFourOfAKind(hand)) {
      return "四條";
    } else if (isFullHouse(hand)) {
      return "葫蘆";
    } else if (isFlush(hand)) {
      return "同花";
    } else if (isStraight(hand)) {
      return "順子";
    } else if (isThreeOfAKind(hand)) {
      return "三條";
    } else if (isTwoPair(hand)) {
      return "兩對";
    } else if (isOnePair(hand)) {
      return "一對";
    } else {
      return "散牌";
    }
  }

  public static void main(String[] args) {
    Card[] hand = {
      new Card(2, Suite.HEAT),
      new Card(2, Suite.SPADE),
      new Card(5, Suite.CLUB),
      new Card(7, Suite.DIAMOND),
      new Card(9, Suite.HEAT)
    };
    System.out.println(Suite[].class);

    System.out.println(isOnePair(hand));
    System.out.println(checkHandType(hand));
    System.out.println(isFlush(hand));
    System.out.println(isFullHouse(hand));
  }
}