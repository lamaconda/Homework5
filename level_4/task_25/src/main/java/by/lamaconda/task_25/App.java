package by.lamaconda.task_25;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Enter array length: ");
        Scanner arrayLengthScanner = new Scanner(System.in);

        int[] arrayFromUser = new int[arrayLengthScanner.nextInt()];

        System.out.println("Enter int numbers: ");
        for (int i = 0; i < arrayFromUser.length; i++) {
            arrayFromUser[i] = arrayLengthScanner.nextInt();
        }

        for (int i: arrayFromUser) {
            System.out.println(i);
        }
    }
}
