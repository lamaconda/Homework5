package by.lamaconda.task_11.service;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromUser {

    private ArrayFromUser() {
    }

    public static void arrayOfThree() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        array[2] = scanner.nextInt();

        System.out.println(Arrays.toString(array));
    }
}
