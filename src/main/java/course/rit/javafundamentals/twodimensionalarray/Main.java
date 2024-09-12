package course.rit.javafundamentals.twodimensionalarray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Max value: " + twoDimensionalArray.findMaxValue(numbers));
        System.out.println("Min value: " + twoDimensionalArray.findMinValue(numbers));
        System.out.println("Sum: " + twoDimensionalArray.calcSum(numbers));
        System.out.printf("Sum of each row: %s%n", Arrays.toString(twoDimensionalArray.calcSumForEachRow(numbers)));
        System.out.printf("Sum of each column: %s%n", Arrays.toString(twoDimensionalArray.calcSumForEachColumn(numbers)));
    }
}
