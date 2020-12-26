package by.lamaconda.task_26;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        Scanner scanner = new Scanner(System.in);

        int[] arrayFromUser = new int[scanner.nextInt()];

        Random random = new Random();

        for (int i = 0; i < arrayFromUser.length; i++) {
            arrayFromUser[i] = random.nextInt();
        }

        for (int i : arrayFromUser) {
            System.out.println(i);
        }

    }
}
