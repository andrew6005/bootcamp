public class LinkedList1<T> {

  static class Node<T> {
    T element;
    Node<T> next;

    Node(T element) {
      this.element = element;
    }
  }

  private Node<T> head;
  private Node<T> tail;

  public void add(T element) {
    Node<T> newNode = new Node<>(element);

    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
  }

  public void printList() {
    Node<T> current = head;
    while (current != null) {
      System.out.println(current.element);
      current = current.next;
    }
  }

  public static void main(String[] args) {
    LinkedList1<String> names = new LinkedList1<>();
    names.add("Leo");
    names.add("Sally");
    names.printList();
  }
}


/*public class LinkedList1<T> {

  public  static  class Node<T>{
    private T element;
    private Node<T> next;
    public T getElemnt(){
      return this.element;
    }
    public Node(T element){
      this.element = element;
     
     
    }
    
 
    

  }

  /*public void add(String string) {
   
  }

  public static void main(String[] args) {
      LinkedList1<String> names =new LinkedList1<String>();
      names.add("Leo");
      names.add("Sally");

      System.out.println(names);
     
    }
}*/
