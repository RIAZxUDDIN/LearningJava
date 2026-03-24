package Array;
import java.sql.SQLOutput;
import java.util.*;

public class findMinMaxSMax {
    public static void main(String[] args) {
        int[] arr = {2,9,5,23,92,25,57,83,69};
        findMinMaxSecond(arr);

    }


    public static void findMinMaxSecond (int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, Smax = Integer.MIN_VALUE;
        if(arr == null || arr.length==0) {
            System.out.println("Array is empty.");
            return;
        }

        if(arr.length == 1) {
            System.out.println("Array: "+ Arrays.toString(arr));
            System.out.println("Minimum value: " + arr[0] + "\nMaximum value: " + arr[0] + "\nNo Second Max.");
            return;
        }

        for(int num : arr) {
            if(num < min) min = num;
            if(num > max) {
                Smax = max;
                max = num;
            }
            else if(num > Smax && num != max) Smax = num;
        }

        System.out.println("Array: " + Arrays.toString(arr) + "\nMin: " + min + "\nMax: " + max + "\nSecond max: " + Smax);

    }
}


