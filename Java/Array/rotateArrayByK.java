package Array;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class rotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {2,9,5,23,92,25,57,83,69};
        System.out.println("Array: "+ Arrays.toString(arr));
        rotateArray(arr, 3, true);
        System.out.println("After rotate array by 3 from left: " + Arrays.toString(arr));


        int[] arr2 = {4, 8, 2, 3, 10, 34, 23, 8};
        System.out.println("\nArray: " + Arrays.toString(arr2));
        rotateArray(arr2, 2, false);
        System.out.println("After rotate array by 2 from right: " + Arrays.toString(arr2));
    }

    public static void reverseArray(int[] a, int start, int end) {
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++; end--;
        }
    }

    public static void rotateArray(int[] arr,int k, boolean left) {
        if(arr == null || arr.length == 1) return;
        k = k % arr.length;
        if(k==0) return;

        if(left) k = arr.length - k;

        reverseArray(arr, 0, arr.length-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, arr.length-1);
    }
}
