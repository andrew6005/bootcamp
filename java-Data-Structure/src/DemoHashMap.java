import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DemoHashMap {
  private static final String String = null;

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
    hashMap.put ("Tsla","Trump");
    System.out.println(hashMap);
    System.out.println(hashMap.size());
    hashMap.put ("Tsla","NVIDA");
    System.out.println(hashMap);
    System.out.println(hashMap.size());
    hashMap.put("abc", null);
    System.out.println(hashMap.get("abc"));
    System.out.println(hashMap2.get("ABC").getName());

    HashMap <String,ArrayList<String>>hashMap3 =new HashMap<>();

    ArrayList<String> fruit = new ArrayList<>();
    fruit.add("apple");
    fruit.add ("Organge");
    hashMap3.put("fruit", fruit);
    ArrayList<String> name= new ArrayList<>();
    name.add("Peter");
    name.add("tommy");
    hashMap3.put("name", name);
    System.out.println(hashMap3);
    System.out.println(hashMap3.get("name").contains("Peter"));
    //Random random =new Random();
    //((Object) hashMap2).random(String , cat);
   // hashMap3.
    //cat = new Cat();
   //cat = hashMap2.compute("name", null) ;

    

    
  }
}
