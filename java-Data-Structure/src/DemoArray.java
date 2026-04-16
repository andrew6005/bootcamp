import java.util.ArrayList;
import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "abc";
        arr[1] = "efg";
        arr[2] = "hij";

        String[] arr2 = new String[4];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length - 1] = "qwe";
        arr = arr2;

        System.out.println(Arrays.toString(arr));

        ArrayList<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("def");
        strings.add("ijk");
        strings.add("qwe");

        System.out.println(strings.size());
        System.out.println(strings.contains("def"));

        strings.set(1, "leo");
        System.out.println(strings);

        System.out.println(strings.get(0));
        System.out.println(strings.get(strings.size() - 1));
        System.out.println(strings.isEmpty());
        System.out.println(strings.equals("a"));

        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.add(100);
        integers1.add(99);

        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(100);
        integers2.add(99);

        System.out.println(integers1.equals(integers2));
        System.out.println(integers1 == integers2);
        System.out.println(integers2.hashCode());
        System.out.println(integers1.hashCode());

        Integer removedItem = integers1.remove(1);
        System.out.println(removedItem);
        System.out.println(integers1);

        boolean isRemoved = strings.remove("ijk");
        System.out.println(isRemoved);

        ArrayList<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("python");

        strings.addAll(languages);
        System.out.println(strings);

        ArrayList<Cat> cats = new ArrayList<>();
        Cat john = new Cat("john");
        cats.add(john);

        Cat tom = new Cat("Tom");
        cats.add(tom);

        System.out.println(cats.contains(new Cat("john")));
        cats.remove(new Cat("Tom"));

        cats.remove(john);

        ArrayList<Character> chs = new ArrayList<>();
        chs.add('a');
        chs.add('b');

        for (Character ch : chs) {
            System.out.print(ch);
        }
        System.out.println();

        for (Cat a : cats) {
            System.out.println(a.getName());
        }
    }
}






 //*  ArrayList VS Array
 //* 1.Array is Fixed length, Arraylist is dynamic length
 //* 2. get by index
 //* Arraylist & array:get by index
 //* 3.Addarlist dynamic add item array(have array)
 //* primitive (Array), class (ArrayList, Array)
  

