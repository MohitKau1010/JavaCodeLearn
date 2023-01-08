import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Java program to sort an array of 0, 1 and 2
import java.io.*;

public class Sorting {

    public void sortArray(){
        /*Driver function to check for above functions*/
        System.out.println("<<<--Sort Integer Array-->>>");
        int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int arr_size = arr.length;
        Countzot.sort012(arr, arr_size);
        Countzot.printArray(arr, arr_size);
    }



    class Countzot {

    // Sort the input array, the array is assumed to
    // have values in {0, 1, 2}
    static void sort012(int[] a, int arr_size) {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        // Iterate till all the elements are sorted
        //todo  { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        while (mid <= hi) {
            switch (a[mid]) {
                // If the element is 0
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                // If the element is 1
                case 1:
                    mid++;
                    break;
                // If the element is 2
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }

    /* Utility function to print array arr[] */
    static void printArray(int[] arr, int arr_size) {
        for (int i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



}
}
