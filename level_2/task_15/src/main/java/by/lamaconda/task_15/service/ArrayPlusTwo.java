package by.lamaconda.task_15.service;

import java.util.Arrays;
import java.util.Random;

public class ArrayPlusTwo {

    private ArrayPlusTwo() {
    }

    public static void arrayCreate() {

        Random random = new Random();

        int[] array = {random.nextInt(), random.nextInt(), random.nextInt()};

        System.out.println(Arrays.toString(array));

        for (int i : array) {
            i += 2;
            System.out.println(i);
        }
    }


}
