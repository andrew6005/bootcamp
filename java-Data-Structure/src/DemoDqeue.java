import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


public class DemoDqeue {
  public static void main(String[] args) {
    Deque<String> dq = new ArrayDeque<>();

    //1. Queue(add Last and poll first)
    //2.Dqueu(Aad Last/. first and poll/last )
    dq.addFirst("lLeo");
    dq.addLast("Peter");
    System.out.println(dq.peek());
    System.out.println(dq.pollFirst());
    dq.addFirst("ellen");
    dq.addLast("Steve");
    System.out.println(dq.getLast());
    System.out.println(dq.peek());
    while (dq.size()>=2) {
      //
      dq.pollLast();
      System.out.println(dq.pollFirst());
      System.out.println(dq.pollLast());
      //dq.pollFirst();
      
    }
    System.out.println(dq.contains("perter"));
    System.out.println(dq.peek());

    dq.push("jenny");
      dq.push("john");
        dq.push("kelly");
        System.out.println(dq);

          System.out.println(dq.pop());
          System.out.println(dq.pop());
        System.out.println(dq.pop());

        //qeue vs Dqeue
        Queue<Integer>queue1 = new LinkedList<>();
        queue1.add(10);
        queue1.poll();

        Queue<Integer>queue2 =new LinkedList<>();
        
        

  }
}
