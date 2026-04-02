import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println(name + " -> " + capacity + " seats");
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC8) ===");

        // ---------- ORIGINAL LIST ----------
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Luxury", 80));

        System.out.println("\nOriginal Bogies:");
        for (Bogie b : bogies) {
            b.display();
        }

        // ---------- STREAM FILTER ----------
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)   // condition
                .collect(Collectors.toList());

        // ---------- DISPLAY FILTERED ----------
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filtered) {
            b.display();
        }

        // ---------- VERIFY ORIGINAL LIST UNCHANGED ----------
        System.out.println("\nOriginal List After Filtering (Unchanged):");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}
