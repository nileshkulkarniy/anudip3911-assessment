import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println(number + " is POSITIVE.");
        } else if (number < 0) {
            System.out.println(number + " is NEGATIVE.");
        } else {
            System.out.println("The number is ZERO.");
        }

        scanner.close();
    }
}
