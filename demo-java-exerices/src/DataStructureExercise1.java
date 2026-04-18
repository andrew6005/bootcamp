
  
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class DataStructureExercise1 {
public static void main(String[] args) {

    
    System.out.println(" Exercise one");
    ArrayList<Integer> numbers1 = new ArrayList<>();
    numbers1.add(10);
    numbers1.add(20);
    numbers1.add(30);
    numbers1.add(40);
    numbers1.add(50);

    System.out.println("All elements: " + numbers1);
    numbers1.remove(Integer.valueOf(30));
    System.out.println("Size of the list: " + numbers1.size());
    System.out.println();

   
    System.out.println("Exercise 2");
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");

    System.out.println("Does Grapes exist? " + fruits.contains("Grapes"));
    if (!fruits.contains("Grapes")) {
      fruits.add("Grapes");
    }

    int mangoIndex = fruits.indexOf("Mango");
    if (mangoIndex != -1) {
      fruits.set(mangoIndex, "Peach");
    }

    System.out.println("Final fruit list: " + fruits);
    System.out.println();

    
    System.out.println("Exercise 3");
    ArrayList<Integer> numbers2 = new ArrayList<>();
    numbers2.add(10);
    numbers2.add(20);
    numbers2.add(10);
    numbers2.add(30);
    numbers2.add(40);
    numbers2.add(20);
    numbers2.add(50);

    System.out.println("Original list: " + numbers2);

    LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>(numbers2);
    ArrayList<Integer> noDuplicates = new ArrayList<>(uniqueSet);

    System.out.println("List after removing duplicates: " + noDuplicates);
    System.out.println();

   
    System.out.println("Exercise 4");
    HashSet<String> countries = new HashSet<>();
    countries.add("USA");
    countries.add("India");
    countries.add("China");
    countries.add("Japan");

    countries.add("Canada");
    boolean addedAgain = countries.add("India");

    System.out.println("Add India again result: " + addedAgain);
    System.out.println("Countries:" + countries);
    System.out.println();

    System.out.println("Exercise 5");
    HashSet<Double> numbers3 = new HashSet<>();
    numbers3.add(1.1);
    numbers3.add(2.2);
    numbers3.add(3.3);
    numbers3.add(4.4);
    numbers3.add(5.5);

    System.out.println("Contains 3.3? " + numbers3.contains(3.3));
    numbers3.remove(2.2);
    System.out.println("Size of the set: " + numbers3.size());
    System.out.println();

  
    System.out.println("Exercise 6");
    HashSet<Integer> set1 = new HashSet<>();
    set1.add(10);
    set1.add(20);
    set1.add(30);
    set1.add(40);

    HashSet<Integer> set2 = new HashSet<>();
    set2.add(30);
    set2.add(40);
    set2.add(50);
    set2.add(60);

    HashSet<Integer> commonNumbers = new HashSet<>(set1);
    commonNumbers.retainAll(set2);

    System.out.println("Common numbers: " + commonNumbers);
    System.out.println();

    
    System.out.println("Exercise 7");
    HashSet<String> namesSet = new HashSet<>();
    namesSet.add("Cherry");
    namesSet.add("Steve");
    namesSet.add("Chole");
    namesSet.add("Jenny");
    namesSet.add("Vicky");

    ArrayList<String> namesList = new ArrayList<>(namesSet);
    System.out.println("Converted list: " + namesList);
    System.out.println();

    
    System.out.println("Exercise 8");
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student(1, "Alice"));
    students.add(new Student(2, "Bob"));
    students.add(new Student(3, "Charlie"));

    System.out.println("All students:");
    for (Student student : students) {
      System.out.println(student);
    }

    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).getName().equals("Bob")) {
        students.remove(i);
        break;
      }
    }

    System.out.println("After removing Bob:");
    for (Student student : students) {
      System.out.println(student);
    }

    System.out.println("Search ID 1: " + searchStudentById(students, 1));
    System.out.println("Search ID 2: " + searchStudentById(students, 2));

    ArrayList<Student> studentsWithA = new ArrayList<>();
    for (Student student : students) {
      if (student.getName().startsWith("A")) {
        studentsWithA.add(student);
      }
    }

    System.out.println("Students with names starting with 'A':");
    for (Student student : studentsWithA) {
      System.out.println(student);
    }
    System.out.println();

    
    System.out.println(" Exercise 9 ");
    HashSet<Student> studentSet1 = new HashSet<>();
    studentSet1.add(new Student(1, "Alice"));
    studentSet1.add(new Student(2, "Bob"));
    studentSet1.add(new Student(3, "Charlie"));

    HashSet<Student> studentSet2 = new HashSet<>();
    studentSet2.add(new Student(2, "Bob"));
    studentSet2.add(new Student(3, "Charlie"));
    studentSet2.add(new Student(4, "David"));

    HashSet<Student> commonStudents = new HashSet<>(studentSet1);
    commonStudents.retainAll(studentSet2);

    System.out.println("Common students:");
    for (Student student : commonStudents) {
      System.out.println(student);
    }
  }

  public static String searchStudentById(ArrayList<Student> students, int id) {
    for (Student student : students) {
      if (student.getId() == id) {
        return student.getName();
      }
    }
    return "Student not found";
  }

  public static class Student {
    private int id;
    private String name;

    
    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }

   
    public int getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

   
    public void setId(int id) {
      this.id = id;
    }

    public void setName(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "ID: " + id + ", Name: " + name;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (!(obj instanceof Student)) {
        return false;
      }
      Student other = (Student) obj;
      return this.id == other.id && Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(id, name);
    }
  }
  
}