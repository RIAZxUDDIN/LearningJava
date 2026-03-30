package Array;
import java.util.*;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,4,4,9,11,20,33,0,0,0,0,0};
        int[] arr2 = {0,3,4,17,25};
        System.out.println("Before merge: \nArray one: "+ Arrays.toString(arr1) + "\nArray two: "+ Arrays.toString(arr2));
        mergeArray(arr1, 7, arr2, arr2.length);
        System.out.println("After merge: " + Arrays.toString(arr1));
    }

    public static void mergeArray(int[] arr1, int m, int[] arr2, int n) {
        int i = m-1, j = n-1, k = m+n-1;
        while(j>=0) {
            if(i>=0 && arr1[i]>arr2[j]) arr1[k--] = arr1[i--];
            else arr1[k--] = arr2[j--];
        }
    }
}
