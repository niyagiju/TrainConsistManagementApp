import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC3) ===");

        // Create HashSet for unique bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // ---------- ADD BOGIE IDs (including duplicates) ----------
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // ---------- DISPLAY FINAL SET ----------
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        // ---------- SIZE ----------
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
    }
}