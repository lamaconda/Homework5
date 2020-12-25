package by.lamaconda.task_13.service;

import java.util.Random;

public class ArraySumOfRandom {

    private ArraySumOfRandom() {
    }

    public static void randomArraySum() {

        int[] randomArray = new int[3];

        Random rand = new Random();

        randomArray[0] = rand.nextInt();
        randomArray[1] = rand.nextInt();
        randomArray[2] = rand.nextInt();

        int sum = randomArray[0] + randomArray[1] + randomArray[2];

        System.out.println(sum);
    }
}
