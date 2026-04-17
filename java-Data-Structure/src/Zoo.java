import java.util.ArrayList;

public class Zoo<T extends Animal> {
  private ArrayList<T>animal;

  public Zoo(){
    this.animal = new ArrayList<>();

  }
  public ArrayList<T>getAnimal(){
    return this.animal;
  }
  public boolean add(T animal){
    return this.animal.add(animal);
  }

  public static void main(String[] args) {
    //!runtime -> redefine T
    Zoo<Tiger> zoo1 = new Zoo<>();
    zoo1.add(new Tiger());
 
    

    Zoo<Panda> zoo2 = new Zoo<>();
    zoo2.add(new Panda());

    Zoo<Animal> zoo3 = new Zoo<>();
    zoo3.add(new Panda());
    zoo3.add(new Tiger());

    //zoo.add(new Tiger());
    
  }
}
