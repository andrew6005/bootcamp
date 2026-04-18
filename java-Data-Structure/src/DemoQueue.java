import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {//*  linked list or ArrayDeque (how to do)
  public static void main(String[] args) {
    Queue<String> queue=new ArrayDeque<>();
    queue.add("Leo");
    queue.add("Tommy");
    queue.add("Alex");
    System.out.println(queue.peek());
    System.out.println(queue.remove());
    while (!queue.isEmpty()) {
      String head=queue.poll();
      System.out.println(head);
    }
    System.out.println(queue.size());


     //System.out.println(queue.remove());
     queue.poll();


  




    List<String> strings = new ArrayList<>();
    List<String> strings2 = new ArrayList<>();

  }
}
