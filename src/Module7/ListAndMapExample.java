package Module7;

import java.util.ArrayList;
import java.util.List;

public class ListAndMapExample {
    public static void main(String[] args) {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double[] averageTemperatures = {67.8, 65.3, 72.3, 67.8, 70.1, 85.9, 82.6};

        // Implement a List as an ArrayList
        List<Double> temperatureList = new ArrayList<>();

        // Add the temperatures to the ArrayList
        for (double temperature : averageTemperatures) {
            temperatureList.add(temperature);
        }

        System.out.println("TEMPERATURES USING ARRAYLIST:");
        System.out.println("-----------------------------------------");

        // Print the temperatures for each day, using the index in the list to obtain the weekdays
        for (int index = 0; index < temperatureList.size(); index++) {
            System.out.println("Temperature for " + weekdays[index] + ": " + temperatureList.get(index));
        }
    }
}
