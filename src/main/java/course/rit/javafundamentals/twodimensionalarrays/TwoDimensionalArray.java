package course.rit.javafundamentals.twodimensionalarrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDimensionalArray {
    /**
     * Reads values from a file and stores them in a two-dimensional array.
     *
     * @param filename the name of the file to read values from
     * @return a two-dimensional array of integers
     * @example TwoDimensionalArray tda = new TwoDimensionalArray();
     * int[][] array = tda.readValuesFromFile("numbers.csv");
     */
    public int[][] readValuesFromFile(String filename) {
        return new int[0][0];
    }

    /**
     * Finds the maximum value in a two-dimensional array.
     *
     * @param numbers the two-dimensional array of integers
     * @return the maximum value found in the array
     * @example int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
     * TwoDimensionalArray tda = new TwoDimensionalArray();
     * int maxValue = tda.findMaxValue(array); // maxValue will be 9
     */
    public int findMaxValue(int[][] numbers) {
        return 0;
    }

    /**
     * Finds the minimum value in a two-dimensional array.
     *
     * @param numbers the two-dimensional array of integers
     * @return the minimum value found in the array
     * @example int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
     * TwoDimensionalArray tda = new TwoDimensionalArray();
     * int minValue = tda.findMinValue(array); // minValue will be 1
     */
    public int findMinValue(int[][] numbers) {
        return 0;
    }

    /**
     * Calculates the sum of all the elements in a two-dimensional array.
     *
     * @param numbers the two-dimensional array of integers
     * @return the sum of all the elements in the array
     * @example int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
     * TwoDimensionalArray tda = new TwoDimensionalArray();
     * int sum = tda.calcSum(array); // sum will be 45
     */
    public int calcSum(int[][] numbers) {
        return 0;
    }

    /**
     * Calculates the sum of each row in a two-dimensional array.
     *
     * @param numbers the two-dimensional array of integers
     * @return an array of integers where each element is the sum of the corresponding row in the input array
     * @example int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
     * TwoDimensionalArray tda = new TwoDimensionalArray();
     * int[] sums = tda.calcSumForEachRow(array); // sums will be {6, 15, 24}
     */
    public int[] calcSumForEachRow(int[][] numbers) {
        return new int[0];
    }

    /**
     * Calculates the sum of each column in a two-dimensional array.
     *
     * @param numbers the two-dimensional array of integers
     * @return an array of integers where each element is the sum of the corresponding column in the input array
     * @example int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
     * TwoDimensionalArray tda = new TwoDimensionalArray();
     * int[] sums = tda.calcSumForEachColumn(array); // sums will be {12, 15, 18}
     */
    public int[] calcSumForEachColumn(int[][] numbers) {
        return new int[0];
    }
}