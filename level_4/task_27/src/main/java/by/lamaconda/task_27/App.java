package by.lamaconda.task_27;


import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] myArray = new int[4];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt();
        }
        for (int i : myArray) {
            System.out.println(i);
        }

        int max = 0;
        System.out.println("Max value in array is: ");
        for (int i : myArray) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
