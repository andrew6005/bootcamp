import java.util.ArrayList;
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
  strings.remove(strings.size()/2);
  System.out.println(strings);


  ArrayList<String> strings2 =new ArrayList<>();
  strings2.add("leo");
  strings2.add("john");
  strings2.add("vicent");
  strings2.add("Sally");

  //strings2.remove(strings.size()/2);
  //*cerate delete upadate  search
  //*CRUD
}
}
