import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("Sally");
        strings.add("Leo");
        strings.add("Json");
        strings.add("alex");

        System.out.println(strings);

        strings.add("Json");
        System.out.println(strings);

        System.out.println(strings.contains("Alex"));

        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat("cathy"));
        cats.add(new Cat("Oscar"));
        cats.add(new Cat("Ben"));

        System.out.println(cats);

        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }

        System.out.println(cats.contains(new Cat("Tom")));
        System.out.println(cats.contains(new Cat("Oscar")));
    }
}