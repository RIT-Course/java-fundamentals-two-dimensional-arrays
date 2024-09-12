package course.rit.javafundamentals.twodimensionalarrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        // create a 2D array and initialize it by reading values from the numbers.csv file
        int[][] arr = twoDimensionalArray.readValuesFromFile("numbers.csv");

        // print the maximum value in the 2D array
        System.out.println("Max value: " + twoDimensionalArray.findMaxValue(arr));

        // print the minimum value in the 2D array
        System.out.println("Min value: " + twoDimensionalArray.findMinValue(arr));

        // print the sum of all the elements in the 2D array
        System.out.println("Sum: " + twoDimensionalArray.calcSum(arr));

        // print the sum of each row in the 2D array
        System.out.printf("Sum of each row: %s%n", Arrays.toString(twoDimensionalArray.calcSumForEachRow(arr)));

        // print the sum of each column in the 2D array
        System.out.printf("Sum of each column: %s%n", Arrays.toString(twoDimensionalArray.calcSumForEachColumn(arr)));
    }
}
