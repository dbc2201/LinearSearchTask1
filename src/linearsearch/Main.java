/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 26/03/20
 *   Time: 9:18 AM
 */

package linearsearch;

/**
 * This class will be used to demonstrate linear search.
 */
public class Main {
    public static void main(String[] args) {

    }

    /**
     * Finds an integer number in a given integer array.
     *
     * @param array  the integer array in which the number is to be searched.
     * @param number the number to search for.
     * @throws NumberNotFoundInArrayException throws this exception if the number is not present in the array.
     */
    private static int findNumberInIntegerArray(int[] array, int number) throws NumberNotFoundInArrayException {
        int response = -1;
        return response;
    }
}

class NumberNotFoundInArrayException extends Exception {
    public NumberNotFoundInArrayException(String message) {
        super(message);
    }
}
