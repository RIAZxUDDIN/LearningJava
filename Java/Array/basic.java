package Array;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//        int[] arr = new int[10];
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for(int i =0; i<arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//            sum += arr[i];
//        }
////        for(int num : arr){
////            System.out.print(num + " ");
////            sum += num;
////        }
//        System.out.println("\nSum = "+ sum);


        int[] arr = {23,75, 27, 92, 10, 35, 41, 59, 27, 31, 25, 27};
        int sum = 0, min = arr[0], max = arr[0];
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }

//        for(int num : arr) {
//            sum += num;
//            if(num < min) min = num;
//            if(num > max) max = num;
//        }

        System.out.println("\nSum = "+sum+ "\nAverage = " + (sum/arr.length) + "\nMinimum number in the array = " + min + "\nMaximum number in the array = " + max);


        // Appears time
        int n = 27;
        int count = 0;
        for(int num : arr) {
            if(num == n) count++;
        }
        System.out.println(n + " appears " + count + " times in the array.");


        // reverse array
        int[] arr2 = {4, 9, 10, 43, 92, 11, 37};
        System.out.print("Before reverse: ");
        for(int num:arr2) {
            System.out.print(num + " ");
        }
        int i = 0, j=arr2.length-1;
        while(i<j) {
            int temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
            i++; j--;
        }
        System.out.print("\nAfter reverse: ");
        for(int num:arr2) {
            System.out.print(num + " ");
        }


        // linear search
        int target = 52;
        boolean flag = false;
        for(int num : arr2) {
            if(num == target) {
                flag = true; break;
            }
        }
        if(flag) {
            System.out.println("\nFound.");
        }
        else System.out.println("\nNot found.");

        sc.close();

    }
}
