/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 01/04/20
 *   Time: 10:43 AM
 */

package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many elements would you like in the array?: ");
        final Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        scanner.close();
        int[] randomNumbers = new int[numberOfElements];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
        }
    }
}
