import java.util.PriorityQueue;

public class DemoPrioity {
  public static void main(String[] args) {
    PriorityQueue < Person > persons = new PriorityQueue<>();

    persons.add(new Person(50));
    
    persons.add(new Person(60));
     persons.add(new Person(30));
      persons.add(new Person(20));
       persons.add(new Person(65));
       persons.add(new Person(70));
      for(Person p:persons){
        System.out.println("Age="+p.getAge());

      }






    //System.out.println(persons.poll().getAge());
    //persons.add(new Person(70));
   // System.out.println(persons.poll().getAge());
    persons.add(new Person(65));
    //while (!persons.isEmpty()) {
    //Person.head = persons.poll();
    System.out.println(persons.poll().getAge());
     System.out.println(persons.size());
      System.out.println(persons.poll().getAge());


    PriorityQueue < Person > dq2 = new PriorityQueue<>(new SortByAgeDesc());
    dq2.add(new Person(50));
     dq2.add(new Person(80));
      dq2.add(new Person(40));
         dq2.add(new Person(30));
          dq2.add(new Person(60));
           dq2.add(new Person(100));
           System.out.println("the age"+dq2.poll().getAge());
           System.out.println("the age"+dq2.poll().getAge());
           System.out.println("the age"+dq2.poll().getAge());
           System.out.println("the age"+dq2.poll().getAge());
           System.out.println("the age"+dq2.poll().getAge());
           System.out.println("the age"+dq2.poll().getAge());


      
    }


  }

