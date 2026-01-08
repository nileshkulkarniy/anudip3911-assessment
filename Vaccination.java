import java.util.Scanner;
abstract class Vaccine {
    int age;
    String nationality;
    boolean firstDoseTaken = false;
    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }
    void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("Your first dose successfully done.");
            System.out.println("You have to pay 250 Rs");
            firstDoseTaken = true;
        } else {
            System.out.println("You are not eligible for first dose");
        }
    }
    void secondDose() {
        if (firstDoseTaken) {
            System.out.println("Your second dose successfully done.");
        } else {
            System.out.println("Please complete first dose first");
        }
    }
    abstract void boosterDose();
}
class VaccinationSuccessful extends Vaccine {
    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }
    @Override
    void boosterDose() {
        if (firstDoseTaken) {
            System.out.println("Your booster dose successfully done.");
        } else {
            System.out.println("Booster dose not allowed");
        }
    }
}
public class Vaccination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nationality: ");
        String nationality = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        Vaccine v = new VaccinationSuccessful(age, nationality);
        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
}
