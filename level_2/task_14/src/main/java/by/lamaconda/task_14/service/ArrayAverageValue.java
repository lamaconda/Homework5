package by.lamaconda.task_14.service;

import java.util.Random;

public class ArrayAverageValue {

    private ArrayAverageValue() {
    }

    public static void arrayOfAverageValue() {

        int[] array = new int[3];

        Random random = new Random();

        array[0] = random.nextInt();
        array[1] = random.nextInt();
        array[2] = random.nextInt();

        for (int j : array) {
            System.out.println(j);
        }

        int averageValue = (array[0] + array[1] + array[2]) / array.length;

        System.out.println("Average value is: " + averageValue);
    }

}

