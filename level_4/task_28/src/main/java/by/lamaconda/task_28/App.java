package by.lamaconda.task_28;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] myArray = new int[5];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt();
        }

        for (int i : myArray) {
            System.out.println(i);
        }

        System.out.println("Min value in array is: ");
        int min = 0;

        for (int i : myArray) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
