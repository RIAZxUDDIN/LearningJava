package PatternPrinting;
import java.util.*;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int row = sc.nextInt();
//           * * * *
//          * * * *
//         * * * *
//        * * * *
        for(int i=1; i<=row; i++) {
            for(int j=i; j<row; j++) {
                System.out.print("  ");
            }
            for(int k=1; k<=row; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
