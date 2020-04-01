/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 01/04/20
 *   Time: 10:43 AM
 */

package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many elements would you like in the array?: ");
        final Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        scanner.close();
        int[] randomNumbersArray = new int[numberOfElements];
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(randomNumbersArray));
        System.out.println("Press 1 to perform linear search.");
        System.out.println("Press 2 to perform binary search.");
    }
}
