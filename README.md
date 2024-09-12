# Two dimensional arrays

This assignment should help you to refresh your knowledge on working with two-dimensional arrays.
In the [resources](src/main/resources) folder you can find a .csv (comma separated values) file 
([numbers.csv](src/main/resources/numbers.csv)) that contains the representation of a two-dimensional integer array.

For example if the content of the csv file is

```csv
1,2
39,4
```

then the two-dimensional array contains the following values:

```java
System.out.println(numbers[0][0]); // prints 1
System.out.println(numbers[0][1]); // prints 2
System.out.println(numbers[1][0]); // prints 39
System.out.println(numbers[1][1]); // prints 4
```

Your task is to implement all methods in the [TwoDimensionalArray](src/main/java/course/rit/javafundamentals/twodimensionalarrays/TwoDimensionalArray.java) class.

Unit tests are provided in the [TwoDimensionalArrayTests](src/test/java/course/rit/javafundamentals/twodimensionalarrays/TwoDimensionalArrayTests.java) class to verify the correctness of your implementation.
You can run the tests using the following command:

```bash
mvn test
```