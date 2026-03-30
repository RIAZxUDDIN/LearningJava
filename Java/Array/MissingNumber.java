package Array;
import java.util.*;

public class MissingNumber {
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9,10,11,13,6,14,15};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Missing number: "+ findMissing(arr));

    }

    public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 1; i<= n; i++) {
            xor1 = xor1 ^ i;
        }
        for(int i=0; i<arr.length; i++) {
            xor2 = xor2 ^ arr[i];
        }
        return xor1 ^ xor2;
    }
}
