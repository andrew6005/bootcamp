
    // Exercise 1: Queue Basic Operations
    // 1a. Create a Queue of integers using LinkedList.
    // 1b. Add the numbers: 5, 10, 15, 20, 25.
    // 1c. Print the head of the queue without removing it.
    // 1d. Remove two elements from the queue.
    // 1e. Print the remaining queue and its size.

    // Exercise 2: Queue Simulation
    // 2a. Create a Queue of Strings representing customers in a bank line.
    // Add the following customers: "Alice", "Bob", "Charlie", "David".
    // 2b. Serve (remove) the first two customers.
    // 2c. Print the remaining customers in the queue.
    // 2d. Add two new customers: "Eva", "Frank".
    // 2e. Write a method that processes the queue until it is empty, printing each served customer.

    // Exercise 3: Palindrome Checker
    // 3a. Write a method `isPalindrome(String word)` using a Deque<Character>.
    // It should return true if the word is a palindrome, false otherwise.
    // Example: "level" -> true, "hello" -> false.

    // Exercise 4: Browser History Simulation
    // 4a. Use a Deque<String> to simulate browser history navigation.
    // Add pages: "google.com", "facebook.com", "youtube.com", "github.com".
    // 4b. Simulate "back" and "forward"g navigation using deque operations.
    // 4c. Print the current page after each operation.

    // Exercise 5: Word Frequency Counter
    // 5a. Create a method `countWordFrequency(String text)` that uses a HashMap<String, Integer>.
    // 5b. The method should split the text by spaces and count occurrences of each word.
    // Example input: "apple banana apple orange banana apple"
    // Output: {apple=3, banana=2, orange=1}
    // 5c. Print the word with the highest frequency.
    
    // Exercise 6: Student Directory with HashMap
    // 6a. Create a HashMap<Integer, Student> where key = student ID, value = Student object.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // ID: 4, Name: David
    // 6b. Write a method to search for a student by ID.
    // 6c. Write a method to remove a student by ID.
    // 6d. Print all student names in alphabetical order.

    // Exercise 7: Inverse Mapping
    // 7a. Create a HashMap<String, String> mapping countries to capitals:
    // {"USA" -> "Washington", "France" -> "Paris", "Japan" -> "Tokyo", "India" -> "Delhi"}
    // 7b. Create an inverse mapping (capital -> country) using another HashMap.
    // 7c. Print the inversed map.
    
     // Exercise 8: HashMap with Multiple Values
    // 8a. Create a HashMap<String, ArrayList<String>> to store subjects taken by each student.
    // 8b. Add:
    //      "Alice" -> ["Math", "Science"]
    //      "Bob" -> ["History"]
    //      "Charlie" -> ["Math", "English"]
    // 8c. Add "English" to Bob’s subjects.
    // 8d. Print each student with their subjects.
    // 8e. Write a method to return all students taking "Math".

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


public class DataStructureExercise2 {
  public static void main(String[] args) {

    
    System.out.println("Exercise 1");
    Queue<Integer> queue = new LinkedList<>();
    queue.add(5);
    queue.add(10);
    queue.add(15);
    queue.add(20);
    queue.add(25);

    System.out.println("Head of queue: " + queue.peek());

    queue.poll();
    queue.poll();

    System.out.println("Remaining queue: " + queue);
    System.out.println("Queue size: " + queue.size());
    System.out.println();

   
    System.out.println("Exercise 2");
    Queue<String> customers = new LinkedList<>();
    customers.add("Alice");
    customers.add("Bob");
    customers.add("Charlie");
    customers.add("David");

    customers.poll();
    customers.poll();

    System.out.println("Remaining customers: " + customers);

    customers.add("Eva");
    customers.add("Frank");

    System.out.println("Queue before processing: " + customers);
    processQueue(customers);
    System.out.println("Queue after processing: " + customers);
    System.out.println();

  
    System.out.println("Exercise 3");
    System.out.println("level -> " + isPalindrome("level"));
    System.out.println("hello -> " + isPalindrome("hello"));
    System.out.println("madam -> " + isPalindrome("madam"));
    System.out.println();

    
    System.out.println("Exercise 4");
    Deque<String> backStack = new ArrayDeque<>();
    Deque<String> forwardStack = new ArrayDeque<>();

    String currentPage = "google.com";
    System.out.println("Current page: " + currentPage);

    backStack.push(currentPage);
    currentPage = "facebook.com";
    forwardStack.clear();
    System.out.println("Current page: " + currentPage);

    backStack.push(currentPage);
    currentPage = "youtube.com";
    forwardStack.clear();
    System.out.println("Current page: " + currentPage);

    backStack.push(currentPage);
    currentPage = "github.com";
    forwardStack.clear();
    System.out.println("Current page: " + currentPage);

    if (!backStack.isEmpty()) {
      forwardStack.push(currentPage);
      currentPage = backStack.pop();
      System.out.println("After back: " + currentPage);
    }

    if (!backStack.isEmpty()) {
      forwardStack.push(currentPage);
      currentPage = backStack.pop();
      System.out.println("After back again: " + currentPage);
    }

    if (!forwardStack.isEmpty()) {
      backStack.push(currentPage);
      currentPage = forwardStack.pop();
      System.out.println("After forward: " + currentPage);
    }
    System.out.println();

    // Exercise 5: Word Frequency Counter
    System.out.println("Exercise 5");
    String text = "apple banana apple orange banana apple";
    HashMap<String, Integer> wordMap = countWordFrequency(text);
    System.out.println("Word frequency: " + wordMap);

    String highestWord = "";
    int highestCount = 0;

    for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
      if (entry.getValue() > highestCount) {
        highestWord = entry.getKey();
        highestCount = entry.getValue();
      }
    }

    System.out.println("Highest frequency word: " + highestWord);
    System.out.println("Count: " + highestCount);
    System.out.println();


    System.out.println("Exercise 6");
    HashMap<Integer, Student> studentMap = new HashMap<>();
    studentMap.put(1, new Student(1, "Alice"));
    studentMap.put(2, new Student(2, "Bob"));
    studentMap.put(3, new Student(3, "Charlie"));
    studentMap.put(4, new Student(4, "David"));

    System.out.println("Search ID 2: " + searchStudentById(studentMap, 2));

    removeStudentById(studentMap, 2);
    System.out.println("After removing ID 2: " + studentMap);

    ArrayList<String> studentNames = new ArrayList<>();
    for (Student student : studentMap.values()) {
      studentNames.add(student.getName());
    }

    Collections.sort(studentNames);

    System.out.println("Student names in alphabetical order:");
    for (String name : studentNames) {
      System.out.println(name);
    }
    System.out.println();

   
    System.out.println("Exercise 7");
    HashMap<String, String> countryToCapital = new HashMap<>();
    countryToCapital.put("USA", "Washington");
    countryToCapital.put("France", "Paris");
    countryToCapital.put("Japan", "Tokyo");
    countryToCapital.put("India", "Delhi");

    HashMap<String, String> capitalToCountry = new HashMap<>();
    for (Map.Entry<String, String> entry : countryToCapital.entrySet()) {
      capitalToCountry.put(entry.getValue(), entry.getKey());
    }

    System.out.println("Inversed map: " + capitalToCountry);
    System.out.println();

   
    System.out.println("Exercise 8");
    HashMap<String, ArrayList<String>> studentSubjects = new HashMap<>();

    ArrayList<String> aliceSubjects = new ArrayList<>();
    aliceSubjects.add("Math");
    aliceSubjects.add("Science");
    studentSubjects.put("Alice", aliceSubjects);

    ArrayList<String> bobSubjects = new ArrayList<>();
    bobSubjects.add("History");
    studentSubjects.put("Bob", bobSubjects);

    ArrayList<String> charlieSubjects = new ArrayList<>();
    charlieSubjects.add("Math");
    charlieSubjects.add("English");
    studentSubjects.put("Charlie", charlieSubjects);

    studentSubjects.get("Bob").add("English");

    System.out.println("Student subjects:");
    for (Map.Entry<String, ArrayList<String>> entry : studentSubjects.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

    System.out.println("Students taking Math: " + getStudentsTakingMath(studentSubjects));
  }

  public static void processQueue(Queue<String> queue) {
    while (!queue.isEmpty()) {
      System.out.println("Served customer: " + queue.poll());
    }
  }

  public static boolean isPalindrome(String word) {
    Deque<Character> deque = new ArrayDeque<>();

    for (int i = 0; i < word.length(); i++) {
      deque.addLast(word.charAt(i));
    }

    while (deque.size() > 1) {
      char first = deque.removeFirst();
      char last = deque.removeLast();

      if (first != last) {
        return false;
      }
    }

    return true;
  }

  public static HashMap<String, Integer> countWordFrequency(String text) {
    HashMap<String, Integer> map = new HashMap<>();
    String[] words = text.split(" ");

    for (String word : words) {
      if (map.containsKey(word)) {
        map.put(word, map.get(word) + 1);
      } else {
        map.put(word, 1);
      }
    }

    return map;
  }

  public static Student searchStudentById(HashMap<Integer, Student> map, int id) {
    return map.get(id);
  }

  public static void removeStudentById(HashMap<Integer, Student> map, int id) {
    map.remove(id);
  }

  public static ArrayList<String> getStudentsTakingMath(HashMap<String, ArrayList<String>> map) {
    ArrayList<String> result = new ArrayList<>();

    for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
      if (entry.getValue().contains("Math")) {
        result.add(entry.getKey());
      }
    }

    return result;
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
  }
}
