package org.example.tasks;

/**
 * Given an array with x integers and the position with n to rotate from an array,
 *
 *  int[] inputArray = {1, 2, 3, 4, 5, 6, 7} & position is 3.
 *  outputArray = {4, 5, 6, 7,1,2,3};
 */
public class RotateArray {
    public int[] getRotated(int[] array, int n) {
        int[] result = new int[array.length];

        for(int i=0;i<array.length;i++){
            if(n==array.length) n=0;
            result[i] = array[n++];
        }
        return result;
    }
}
