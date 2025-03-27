// java.util.pacakage use 
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Using ArrayList to store a list of names
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Names in the ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }

        // Using HashMap to store key-value pairs
        HashMap<Integer, String> idToNameMap = new HashMap<>();
        idToNameMap.put(1, "Alice");
        idToNameMap.put(2, "Bob");
        idToNameMap.put(3, "Charlie");

        System.out.println("\nData in the HashMap:");
        for (Integer id : idToNameMap.keySet()) {
            System.out.println("ID: " + id + ", Name: " + idToNameMap.get(id));
        }
    }
}