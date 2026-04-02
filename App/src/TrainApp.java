import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        ArrayList<String> train = new ArrayList<>();

        // ---------- ADD BOGIES ----------
        train.add("Sleeper");
        train.add("AC Chair");
        train.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println(train);

        // ---------- REMOVE BOGIE ----------
        train.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println(train);

        // ---------- CHECK EXISTENCE ----------
        if(train.contains("Sleeper")) {
            System.out.println("\n'Sleeper' bogie exists in the train.");
        } else {
            System.out.println("\n'Sleeper' bogie not found.");
        }

        // ---------- FINAL STATE ----------
        System.out.println("\nFinal Train Bogies:");
        System.out.println(train);
    }
}