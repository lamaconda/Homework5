package by.lamaconda.level_5_and_6.util;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    @Test
    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] expected = new int[5];
        int[] actual = arrayUtil.createArray(5);

        if (expected.length == actual.length) {
            System.out.println("Test success");
        } else {
            System.out.println("FAIL");
        }
    }

    @Test
    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {2, 4, 6, 9};
        int expected = 9;
        int actual = arrayUtil.findMaxNumber(array);
        if (expected == actual) {
            System.out.println("Test success");
        } else {
            System.out.println("FAIL");
        }
    }

    @Test
    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {2, 4, 6, 9};
        int expected = 2;
        int actual = arrayUtil.findMinNumber(array);
        if (expected == actual) {
            System.out.println("Test success");
        } else {
            System.out.println("FAIL");
        }
    }


}
