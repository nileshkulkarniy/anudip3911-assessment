import java.util.HashMap;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        HashMap<String, String> directory = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Find number");
            System.out.println("2. Add number");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    if (directory.containsKey(name)) {
                        System.out.println("Phone number: " + directory.get(name));
                    } else {
                        System.out.println("Name not found");
                    }
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();
                    directory.put(newName, phone);
                    System.out.println("Contact added");
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}
