/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 26/03/20
 *   Time: 9:18 AM
 */

package linearsearch;

import exceptions.NumberNotFoundInArrayException;

/**
 * This class will be used to demonstrate linear search.
 */
public class LinearSearch {
    /**
     * Finds an integer number in a given integer array.
     *
     * @param array  the integer array in which the number is to be searched.
     * @param number the number to search for.
     * @throws NumberNotFoundInArrayException throws this exception if the number is not present in the array.
     */
    public int findNumberInIntegerArray(int[] array, int number) throws NumberNotFoundInArrayException {
        int response = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                response = i;
                break; // to stop after 1 occurrence, remove for multiple occurrences.
            }
        }
        if (response == -1) {
            throw new NumberNotFoundInArrayException(number + " is not present in the array!");
        } else {
            return response;
        }
    }
}
