import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("c");
        list.add("java");
        list.add("python");
        list.add("spring");
        list.add("html");

        System.out.println("Original List: " + list);

        Collections.reverse(list);

        System.out.println("Reversed List: " + list);
    }
}
