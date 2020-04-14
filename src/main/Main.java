/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 01/04/20
 *   Time: 10:43 AM
 */

package main;

import binarysearch.BinarySearch;
import exceptions.NumberNotFoundInArrayException;
import linearsearch.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many elements would you like in the array?: ");
        final Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] randomNumbersArray = new int[numberOfElements];
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(randomNumbersArray));
        System.out.println("Press 1 to perform linear search.");
        System.out.println("Press 2 to perform binary search.");
        int choice = scanner.nextInt();
        System.out.println("What number would you like to find?");
        int number = scanner.nextInt();
        switch (choice) {
            case 1: /*LINEAR SEARCH*/
                LinearSearch linearSearch = new LinearSearch();
                try {
                    int index = linearSearch.findNumberInIntegerArray(randomNumbersArray, number);
                    System.out.println(number + " found at index " + index);
                } catch (NumberNotFoundInArrayException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2: /*BINARY SEARCH*/
                Arrays.sort(randomNumbersArray);
                BinarySearch binarySearch = new BinarySearch();
                try {
                    int index = binarySearch.binarySearch(randomNumbersArray, number);
                    System.out.println(number + " found at index " + index);
                } catch (NumberNotFoundInArrayException e) {
                    System.out.println(e.getMessage());
                }
                break;
        }
        scanner.close();
    }
}
