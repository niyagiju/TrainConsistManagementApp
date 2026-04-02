import java.util.*;

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

        System.out.println("=== Train Consist Management App (UC7) ===");

        // Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // ---------- ADD BOGIES ----------
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            b.display();
        }

        // ---------- SORT USING COMPARATOR (BY CAPACITY) ----------
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (By Capacity Ascending):");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}