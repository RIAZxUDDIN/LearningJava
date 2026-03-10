package PatternPrinting;
import java.util.*;

public class basic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        *****
//        *****
//        *****
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

//        1234
//        1234
//        1234
//        1234
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=col; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("\n");

//        A B C D
//        A B C D
//        A B C D
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print((char)(j+65)+" ");
            }
            System.out.println();
        }
        System.out.println();

//        *
//        **
//        ***
        for(int i=0; i<row; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

//        1
//        1 2
//        1 2 3
        for(int i=1; i<=row; i++) {
            for(int j=1; j<i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

//        1
//        A B
//        1 2 3
//        A B C D
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=i; j++) {
                if(i%2!=0) System.out.print(j+" ");
                else System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        System.out.println();

//        * * * *
//        * * *
//        * *
//        *
        for(int i=row; i>0; i--) {
            for(int j=i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

//        1 2 3 4
//        1 2 3
//        1 2
//        1
        for(int i=1; i<=row; i++) {
            for (int j=1; j<=row+1-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

//        * * * * * * * *
//        *             *
//        *             *
//        * * * * * * * *
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++) {
                if(i==1||j==1||i==row||j==col) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

//            *
//            *
//        * * * * *
//            *
//            *
        if(row%2!=0){
            for(int i=1; i<=row; i++) {
                for(int j=1; j<=row; j++) {
                    if(i==(row/2+1) || j==(row/2+1)) {
                        System.out.print("* ");
                    }
                    else System.out.print("  ");
                }
                System.out.println();
            }
            System.out.println();
        }

//        *     *
//         *   *
//          * *
//           *
//         *  *
//        *    *
//       *      *
        if(row%2!=0) {
            for(int i=1; i<=row; i++) {
                for(int j=1; j<=row; j++) {
                    if(j==i || j==row+1-i) System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
