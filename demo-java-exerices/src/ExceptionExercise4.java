import java.util.Scanner;

public class ExceptionExercise4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();

    scanner.close();

    try {
      registerUser(username, password, email);
      System.out.println("User Registeration is Success.");
    } catch (UserRegistrationException e) {
      System.out.println("User Registeration is Fail.");
    }
  }

  public static class UserRegistrationException extends RuntimeException {
    public UserRegistrationException(String message) {
      super(message);
    }
  }

  public static void registerUser(String username, String password, String email) {
    try {
      validateUsername(username);
      validatePassword(password);
      validateEmail(email);
      System.out.println("User registered successfully: " + username);
    } catch (IllegalArgumentException e) {
      throw new UserRegistrationException(e.getMessage());
    }
  }

  private static void validateUsername(String username) {
    if (username == null || username.trim().isEmpty()) {
      throw new IllegalArgumentException("Invalid username");
    }
  }

  private static void validatePassword(String password) {
    if (password == null || password.length() < 8) {
      throw new IllegalArgumentException("Invalid password");
    }

    boolean hasSpecialChar = false;
    String specialChars = "!@$&_";

    for (int i = 0; i < password.length(); i++) {
      if (specialChars.indexOf(password.charAt(i)) != -1) {
        hasSpecialChar = true;
        break;
      }
    }

    if (!hasSpecialChar) {
      throw new IllegalArgumentException("Invalid password");
    }
  }

  private static void validateEmail(String email) {
    if (email == null || !email.contains("@")) {
      throw new IllegalArgumentException("Invalid email");
    }
  }
}