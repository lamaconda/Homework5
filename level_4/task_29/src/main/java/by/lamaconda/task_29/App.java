package by.lamaconda.task_29;

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
        System.out.println("Even values in Array:");
        for (int i : myArray) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
