package Array;
import  java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Before : " + Arrays.toString(arr));

        int k = removeDuplicatesSorted(arr);
        System.out.print("After: ");
        for(int i=0; i<k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nUnique count: " + k);
    }

    public static int removeDuplicatesSorted(int[] arr){
        if(arr == null || arr.length <= 1) return arr == null ? 0 : arr.length;

        int write = 1;
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                arr[write] = arr[i];
                write++;
            }
        }
        return write;
    }
}
