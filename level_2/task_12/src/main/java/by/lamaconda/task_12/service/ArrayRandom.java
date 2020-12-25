package by.lamaconda.task_12.service;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {
    private ArrayRandom() {
    }

    public static void randomArray() {
        int[] randomArray = new int[3];

        Random random = new Random();

        randomArray[0] = random.nextInt();
        randomArray[1] = random.nextInt();
        randomArray[2] = random.nextInt();

        System.out.println(Arrays.toString(randomArray));
    }
}

