import java.util.Scanner;

public class StrongNumber {
    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    static void checkStrong(int number) {
        int original = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        if (sum == original)
            System.out.println(original + " is a Strong Number");
        else
            System.out.println(original + " is not a Strong Number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        checkStrong(num);
    }
}
