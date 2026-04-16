import java.util.LinkedList;

public class DemoLinkedList {
public static void main(String[] args) {
  LinkedList<String> strings = new LinkedList<>();
  strings.add("leo");
  strings.add("john");
  strings.add("vincent");

  System.out.println(strings.size());
  System.err.println(strings.contains("john"));
  strings.remove(1);
  System.out.println(strings);
  //*cerate delete upadate  search
  //*CRUD
}
}
