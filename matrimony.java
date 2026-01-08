import java.util.Scanner;

public class matrimony {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (Male/Female): ");
        String gender = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        
        if (gender.equals("male") || gender.equals("m")) {
         
            if (age > 21) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible for marriage, please wait.");
            }

        } else if (gender.equals("female") || gender.equals("f")) {
            
            if (age > 18) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible for marriage, please wait.");
            }

        } else {
            System.out.println("Invalid gender entered.");
        }

        sc.close();
    }
}
