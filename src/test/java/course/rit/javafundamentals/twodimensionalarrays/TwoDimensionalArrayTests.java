package course.rit.javafundamentals.twodimensionalarrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TwoDimensionalArrayTests {
    @DataProvider(name = "maxValueDataProvider")
    public Object[][] maxValueDataProvider() {
        return new Object[][]{
                {new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 9},
                {new int[][]{{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}}, -1},
                {new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 0},
                {new int[][]{{5}}, 5},
                {new int[][]{{1, 2}, {3, 4}}, 4}
        };
    }

    @Test(dataProvider = "maxValueDataProvider")
    public void findMaxValueShouldReturnMaxValue(int[][] array, int expectedMaxValue) {
        TwoDimensionalArray unitUnderTest = new TwoDimensionalArray();
        assertEquals(unitUnderTest.findMaxValue(array), expectedMaxValue);
    }

    @DataProvider(name = "minValueDataProvider")
    public Object[][] minValueDataProvider() {
        return new Object[][]{
                {new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1},
                {new int[][]{{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}}, -9},
                {new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 0},
                {new int[][]{{5}}, 5},
                {new int[][]{{1, 2}, {3, 4}}, 1}
        };
    }

    @Test(dataProvider = "minValueDataProvider")
    public void findMinValueShouldReturnMinValue(int[][] array, int expectedMinValue) {
        TwoDimensionalArray unitUnderTest = new TwoDimensionalArray();
        assertEquals(unitUnderTest.findMinValue(array), expectedMinValue);
    }

    @DataProvider(name = "sumDataProvider")
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 45},
                {new int[][]{{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}}, -45},
                {new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 0},
                {new int[][]{{5}}, 5},
                {new int[][]{{1, 2}, {3, 4}}, 10}
        };
    }

    @Test(dataProvider = "sumDataProvider")
    public void findSumShouldReturnSum(int[][] array, int expectedSum) {
        TwoDimensionalArray unitUnderTest = new TwoDimensionalArray();
        assertEquals(unitUnderTest.calcSum(array), expectedSum);
    }

    @DataProvider(name = "sumForEachRowDataProvider")
    public Object[][] sumForEachRowDataProvider() {
        return new Object[][]{
                {new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[]{6, 15, 24}},
                {new int[][]{{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}}, new int[]{-6, -15, -24}},
                {new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, new int[]{0, 0, 0}},
                {new int[][]{{5}}, new int[]{5}},
                {new int[][]{{1, 2}, {3, 4}}, new int[]{3, 7}}
        };
    }

    @Test(dataProvider = "sumForEachRowDataProvider")
    public void findSumForEachRowShouldReturnSumForEachRow(int[][] array, int[] expectedSums) {
        TwoDimensionalArray unitUnderTest = new TwoDimensionalArray();
        assertEquals(unitUnderTest.calcSumForEachRow(array), expectedSums);
    }

    @DataProvider(name = "sumForEachColumnDataProvider")
    public Object[][] sumForEachColumnDataProvider() {
        return new Object[][]{
                {new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[]{12, 15, 18}},
                {new int[][]{{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}}, new int[]{-12, -15, -18}},
                {new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, new int[]{0, 0, 0}},
                {new int[][]{{5}}, new int[]{5}},
                {new int[][]{{1, 2}, {3, 4}}, new int[]{4, 6}}
        };
    }

    @Test(dataProvider = "sumForEachColumnDataProvider")
    public void findSumForEachColumnShouldReturnSumForEachColumn(int[][] array, int[] expectedSums) {
        TwoDimensionalArray unitUnderTest = new TwoDimensionalArray();
        assertEquals(unitUnderTest.calcSumForEachColumn(array), expectedSums);
    }

    @Test
    public void readValuesFromFileShouldReturn2DArray() {
        TwoDimensionalArray unitUnderTest = new TwoDimensionalArray();
        int[][] expectedArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] resultArray = unitUnderTest.readValuesFromFile("src/test/resources/numbers.csv");
        assertEquals(resultArray, expectedArray);
    }
}
