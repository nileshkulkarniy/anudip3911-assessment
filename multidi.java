import java.util.Scanner;
public class multidi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int branches = 3;
        int batches  = 5;
        int students = 5;

    
        int[][][] studentIds = new int[branches][batches][students];

        
        String[] branchNames = { "CSE", "ECE", "MECH" };

    
        for (int b = 0; b < branches; b++) {
            for (int bt = 0; bt < batches; bt++) {
                for (int s = 0; s < students; s++) {
                   
                    studentIds[b][bt][s] = 1000 + b * 100 + bt * 10 + s;
                }
            }
        }

        
        for (int b = 0; b < branches; b++) {
            System.out.println("Branch " + (b + 1) + " (" + branchNames[b] + "):");
            for (int bt = 0; bt < batches; bt++) {
                System.out.println("  Batch " + (bt + 1) + ":");
                for (int s = 0; s < students; s++) {
                    System.out.println("    Student " + (s + 1) + " ID: " + studentIds[b][bt][s]);
                }
            }
            System.out.println();
        }
    }
}
