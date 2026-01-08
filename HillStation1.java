class HillStations {
    void location() {
        System.out.println("Location of Hill Station");
    }
    void famousFor() {
        System.out.println("Famous for natural beauty");
    }
}
class Manali extends HillStations {
    @Override
    void location() {
        System.out.println("Manali is located in Himachal Pradesh");
    }
    @Override
    void famousFor() {
        System.out.println("Manali is famous for snow and adventure sports");
    }
}
class Mussoorie extends HillStations {
    @Override
    void location() {
        System.out.println("Mussoorie is located in Uttarakhand");
    }
    @Override
    void famousFor() {
        System.out.println("Mussoorie is famous for scenic views");
    }}
class Gulmarg extends HillStations {
    @Override
    void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir");
    }
    @Override
    void famousFor() {
        System.out.println("Gulmarg is famous for skiing");
    }}
public class HillStation1 {
    public static void main(String[] args) {
        HillStations h;
        h = new HillStations();
        h.location();
        h.famousFor();
        h = new Manali();
        h.location();
        h.famousFor();
        h = new Mussoorie();
        h.location();
        h.famousFor();
        h = new Gulmarg();
        h.location();
        h.famousFor();
    }
}
