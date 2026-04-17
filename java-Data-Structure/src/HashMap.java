import java.util.ArrayList;

public class HashMap<K,V> {
  private K key;
  private V value;
  private ArrayList<Entry<K,V>> entries;
  public static class Entry<K,V> {
  
    
  }
  public void put (K key , V value){
    Entry<K,V> entry = new Entry<>(key, value);
    this.entries.add(entry);

  }

  public void Entry(K key, V value){
    this.key =key;
    this.value = value;
  }
 

  public HashMap(){

  }
  public V getvalue(){
    return this.value;
  }
  public K getkey(){
    return this.key;
  }
  public static void main(String[] args) {
    HashMap<String ,String> hm= new HashMap<>();
    //hm.set
  }
}
