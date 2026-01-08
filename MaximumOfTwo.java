import java.util.Scanner;

public class MaximumOfTwo {

    static void findMaximum(int a, int b) {
        int max = (a > b) ? a : b;
        System.out.println("Maximum number is: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        findMaximum(num1, num2);
    }
}
