package Module7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueElementExample {
    public static void main(String[] args) {
        // Create an array of numbers with duplicates
        int[] numberTest = {1, 9, 3, 4, 5, 6, 3, 2, 1, 7, 10, 5};

        System.out.println("HASHSET RETURN VALUES:");
        System.out.println("----------------------");

        // Create a HashSet to store unique numbers
        Set<Integer> numberSet = new HashSet<>();

        // Add the numbers to the HashSet, printing the return values
        for (int number : numberTest) {
            System.out.println(numberSet.add(number));
        }

        System.out.println();
        System.out.println("HASHMAP RETURN VALUES:");
        System.out.println("----------------------");

        // Create a HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Add values 1 - 12 in order for each of the keys in numberTest
        for (int index = 0; index < numberTest.length; index++) {
            System.out.println(map.put(numberTest[index], index));
        }
    }
}
