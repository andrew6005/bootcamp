import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DemoSorrting{
  public static void main(String[] args) {
    int[] arr = new int[] {39,11,4,6};
    Arrays.sort(arr);
    System.out.println(arr);

    String []arr2 =new String[]{"abc,","Wewe","sdsf","asdasd"};

    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2));

  //   List<Person> person = new ArrayList<>();
  //   person.add(new Person(80));
  //   person.add(new Person(40));
  //   person.add(new Person(20));
  //   person.add(new Person(70));
  //   Collection.sort(person, new SortByAgeAsc());
  //   System.out.println(person2);
  // 
}
}