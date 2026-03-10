package PatternPrinting;
import java.util.Scanner;

public class medium {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column number: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

//                *
//              * *
//            * * *
//          * * * *
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=row; j++) {
                if(i+j>row) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=row; i++) {
//            for(int j=row; j>i; j--) {
//                System.out.print("  ");
//            }
            for(int l=1; l<=row-i; l++) {
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
