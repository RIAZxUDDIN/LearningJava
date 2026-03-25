package Array;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 19, 23, 25, 29, 30, 31, 33, 37};
        int target = 44;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Has pair for " + target + " ? " + twoSum(arr, target));
    }

    public static boolean twoSum(int[] array, int target) {
        if(array == null || array.length < 2) return false;
        int left = 0, right = array.length - 1;
        while(left < right) {
            int sum = array[left] + array[right];
            if(sum == target) return true;
            else if(sum < target) left++;
            else right--;
        }
        return false;
    }
}
