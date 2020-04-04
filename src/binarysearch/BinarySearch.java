/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 30/03/20
 *   Time: 1:03 PM
 */

package binarysearch;

import exceptions.NumberNotFoundInArrayException;

public class BinarySearch {
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
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex <= endIndex) {

        }
        if (response == -1) {
            throw new NumberNotFoundInArrayException("Number not found in the array");
        } else {
            return response;
        }
    }
}
