public class NumberChecker {

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int number1 = 42;
        System.out.println("The number " + number1 + " is: " + checkEvenOrOdd(number1));

        int number2 = 97;
        System.out.println("The number " + number2 + " is: " + checkEvenOrOdd(number2));

        int number3 = 0;
        System.out.println("The number " + number3 + " is: " + checkEvenOrOdd(number3));

        int number4 = -15;
        System.out.println("The number " + number4 + " is: " + checkEvenOrOdd(number4));
    }
}