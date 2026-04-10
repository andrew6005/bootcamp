import java.util.Scanner;

public class JavaExerise3 {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'&& (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
                System.out.println(ch + " is a vowel.");
            } else if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&
                      ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U'&& (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not an alphabet.");
        }

        input.close();



        // Take salary and years of experience, then calculate and print bonus
    // Experience ≥ 10 years → 20% bonus
    // 5–9 years → 10% bonus
    // < 5 years → 5% bonus
    int exp = 12;
    int salary = 110_000;

    if (exp >= 10) {
        System.out.println("Bonus: " + (salary * 0.20));
    } else if (exp >= 5) {
        System.out.println("Bonus: " + (salary * 0.10));
    } else {
        System.out.println("Bonus: " + (salary * 0.05));
    }
  }
}
