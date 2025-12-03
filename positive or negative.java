import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int number = scanner.nextInt();
        scanner.close();

        String evenOdd = (number % 2 == 0) ? "Even" : "Odd";

        String posNeg;
        if (number > 0) {
            posNeg = "Positive";
        } else if (number < 0) {
            posNeg = "Negative";
        } else {
            posNeg = "Zero";
        }
        
        System.out.println("---------------------------------");
        System.out.println("Result for " + number + ":");
        System.out.println("Status: " + evenOdd + " and " + posNeg);
        System.out.println("---------------------------------");
    }
}