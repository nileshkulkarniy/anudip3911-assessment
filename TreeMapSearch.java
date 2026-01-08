import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapSearch {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Amit", 25);
        map.put("Rahul", 30);
        map.put("Sneha", 22);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        if (map.containsKey(name)) {
            System.out.println(name + " age is: " + map.get(name));
        } else {
            System.out.println("Name not found");
        }
    }
}
