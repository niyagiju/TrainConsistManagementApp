import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC4) ===");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // ---------- ADD BOGIES ----------
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // ---------- INSERT AT POSITION ----------
        train.add(2, "Pantry Car"); // index starts from 0

        System.out.println("\nAfter Inserting Pantry Car at position 2:");
        System.out.println(train);

        // ---------- REMOVE FIRST & LAST ----------
        train.removeFirst();
        train.removeLast();

        // ---------- FINAL STATE ----------
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}