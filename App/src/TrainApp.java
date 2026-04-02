import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC6) ===");

        // Create HashMap for bogie → capacity
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // ---------- INSERT DATA ----------
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // ---------- DISPLAY DATA ----------
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " seats");
        }

        // ---------- FAST LOOKUP ----------
        System.out.println("\nCapacity of Sleeper: " + bogieCapacity.get("Sleeper"));
    }
}