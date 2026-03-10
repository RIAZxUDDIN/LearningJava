package PatternPrinting;
import java.util.*;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int row = sc.nextInt();

//                 *
//               * * *
//             * * * * *
//           * * * * * * *
//        for(int i=1; i<=row; i++){
//            for(int j=1; j<=row-i; j++){
//                System.out.print("  ");
//            }
//            for(int k=1; k<=2*i-1; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();

        int NSp = row-1, NSt = 1;
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=NSp; j++) {
                System.out.print("  ");
            }
            for(int k=1; k<=NSt; k++){
                System.out.print("* ");
            }
            NSp--;
            NSt += 2;
            System.out.println();
        }
        System.out.println();
    }

}
