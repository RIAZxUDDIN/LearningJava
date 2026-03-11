package Array.Two_D_Array;
import java.util.*;

public class transposeMatrix {
    public static void main(String[] args) {
        int[][] arr = { {2,9,5,3}, {6,2,4,8}, {8,3,5,9} };
        int row = arr.length;
        int col = arr[0].length;
        int[][] transpose = new int[col][row];

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        for(int i=0; i<col; i++) {
            for(int j=0; j<row; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
