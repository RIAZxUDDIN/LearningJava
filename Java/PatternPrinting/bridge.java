package PatternPrinting;
import java.util.*;

public class bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

//        for n = 4;
//        * * * * * * *
//        * * *   * * *
//        * *       * *
//        *           *

        for(int i=1; i<=n*2-1; i++){
            System.out.print("* ");
        }
        System.out.println();

        int nsp = 1;
        for(int i=1; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("* ");
            }
            for(int k=1;k<=nsp;k++) {
                System.out.print("  ");
            }
            nsp += 2;
            for(int l=1; l<=n-i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
