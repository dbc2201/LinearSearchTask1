/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 30/03/20
 *   Time: 1:03 PM
 */

package binarysearch;

import exceptions.NumberNotFoundInArrayException;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many elements would you like in the array?: ");
        final Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] randomNumbers = new int[numberOfElements];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println("Enter the number you want to search in the array: ");
        int numberToSearch = scanner.nextInt();
        try {
            System.out.println(numberToSearch + " found at " + binarySearch(randomNumbers, numberToSearch));
        } catch (NumberNotFoundInArrayException e) {
            System.out.println("Number not found in the array!");
        }
        scanner.close();
    }

    /**
     * This method will be used to search for a number in the given array.
     *
     * @param array  the array in which we have to search.
     * @param number the number we have to search for.
     * @return the integer index at which the number is present, -1 if not found.
     * @throws NumberNotFoundInArrayException throws this exception if the number is not present in the array.
     */
    private static int binarySearch(int[] array, int number) throws NumberNotFoundInArrayException {
        int response = -1;
        return response;
    }
}
