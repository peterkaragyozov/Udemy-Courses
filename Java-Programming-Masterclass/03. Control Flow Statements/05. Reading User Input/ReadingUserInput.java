import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (Enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2021 - yearOfBirth;

        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        scanner.close();
    }

}
