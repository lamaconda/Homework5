package by.lamaconda.level_5_and_6.util;

import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = 0;
        for (int i : array) {
            if (i >= max) {
                max = i;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = 0;
        for (int i : array) {
            if (i <= min) {
                min = i;
            }
        }
        return min;
    }

}


