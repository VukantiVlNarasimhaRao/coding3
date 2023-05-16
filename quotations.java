import java.util.Scanner;
public class quotations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        {
            System.out.println("Enter your age");
            age = scanner.nextInt();
        }
        switch (age) {
            case 18 -> System.out.println("you are enter young age");
            case 25 -> System.out.println("you will be love");
            case 45 -> System.out.println("Entering old age");
            case 60 -> System.out.println("depend on children");
            default -> System.out.println("enjoy old age");

        }
    }
}

