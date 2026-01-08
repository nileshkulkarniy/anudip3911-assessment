import java.util.HashMap;
import java.util.Map;

public class CricketerScoreMap {
    public static void main(String[] args) {

        Map<String, Integer> scoreMap = new HashMap<>();

        scoreMap.put("Rohit Sharma", 89);
        scoreMap.put("Virat Kohli", 112);
        scoreMap.put("KL Rahul", 75);

        String searchName = "Rohit Sharma";

        if (scoreMap.containsKey(searchName)) {
            System.out.println(searchName + "'s score: " + scoreMap.get(searchName));
        } else {
            System.out.println("Batsman not found");
        }
    }
}
