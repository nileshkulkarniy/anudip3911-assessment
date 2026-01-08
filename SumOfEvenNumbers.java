import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(15);

        int sum = 0;

        for (int num : list) {
            if (num % 2 == 0) {
                sum = sum + num;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
