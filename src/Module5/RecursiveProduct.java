//----------------------------------------------------------------------------------------------------------------------
//  Option #1:  Implementing Recursion to Provide a Product
//  ---------------------------------------------------------
//
//  Using recursion, create a program that will allow a user to enter five numbers. The program will provide the
//  product of all five numbers using recursive methods.
//----------------------------------------------------------------------------------------------------------------------

package Module5;

import java.math.BigDecimal;
import java.util.Scanner;

public class RecursiveProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];

        // Prompt the user for five numbers
        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            numbers[index] = input.nextDouble();
        }

        // Print the product of the numbers
        System.out.println("Product of the five numbers: " + recursiveProduct(numbers, 0).doubleValue());
    }

    /**
     * Recursively obtains the product of all values in the array numbers starting from the specified index
     * @param numbers the double array of values
     * @param currentIndex the current index in the array (or starting index for first call)
     * @return the product of the values
     */
    public static BigDecimal recursiveProduct(double[] numbers, int currentIndex) {
        // Convert the current value to a BigDecimal (to mitigate double-related rounding errors)
        BigDecimal currentNumber = BigDecimal.valueOf(numbers[currentIndex]);

        // Base case: index is the last number, so return the number
        if (currentIndex == (numbers.length - 1)) {
            return currentNumber;
        }

        // Recursive case: return the current number multiplied by the remaining numbers
        return currentNumber.multiply(recursiveProduct(numbers, currentIndex + 1));
    }
}
