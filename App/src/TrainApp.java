import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC5) ===");

        // Create LinkedHashSet for ordered & unique bogies
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // ---------- ADD BOGIES ----------
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // ---------- ADD DUPLICATE ----------
        train.add("Sleeper"); // duplicate (ignored automatically)

        // ---------- DISPLAY FORMATION ----------
        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(train);

        // ---------- SIZE ----------
        System.out.println("\nTotal Bogies: " + train.size());
    }
}