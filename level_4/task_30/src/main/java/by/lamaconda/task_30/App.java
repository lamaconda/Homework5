package by.lamaconda.task_30;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        int[] myArray = new int[7];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt();
        }

        for (int i : myArray) {
            System.out.println(i);
        }

        System.out.println("Odd values in Array:");

        for (int i : myArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
