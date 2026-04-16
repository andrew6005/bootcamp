import java.util.HashMap;

public class DemoHashMap {
  public static void main(String[] args) {
    HashMap<String, String> hashMap= new HashMap<>();
    hashMap.put("APPL", "Apple");
    hashMap.put ("Tsla","Testla");

    HashMap <String , Cat> hashMap2= new HashMap<>();
    hashMap2.put("ABC" ,new Cat("Jason"));
    hashMap2.put("DEF", new Cat("Mandy"));
    System.out.println(hashMap.size());
    System.out.println(hashMap.get("Tsla"));
    Cat cat = hashMap2.get("DEF");
    System.out.println(cat.getName());
    System.out.println(hashMap2.get("ABC").getName());

    
  }
}
