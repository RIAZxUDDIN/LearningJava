package TwoDArray;

public class ColumnWisePrint {
    public static void main(String[] args) {
        int[][] arr = {{1,2,5,9,3},{3,4,4,2,7},{5,6,6,1,9}};
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0; i<col; i++) {
            for(int j=0; j<row; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

    }
}
