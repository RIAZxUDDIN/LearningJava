package PatternPrinting;
import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

//            *
//          * * *
//        * * * * *
//      * * * * * * *
//        * * * * *
//          * * *
//            *
        int nsp=n-1, nst=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=nst; k++) {
                System.out.print("* ");
            }
            nsp--;nst+=2;
            System.out.println();
        }
        nsp+=2;nst-=4;
        for(int i=1; i<n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=nst; k++){
                System.out.print("* ");
            }
            nsp++; nst-=2;
            System.out.println();
        }

//        int nsp = n/2, nst=1, middle = n/2+1;
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=nsp; j++){
//                System.out.print("  ");
//            }
//            for(int k=1; k<=nst; k++){
//                System.out.print("* ");
//            }
//            if(i<middle){
//                nsp--;
//                nst+=2;
//            }
//            else {
//                nsp++;
//                nst-=2;
//            }
//            System.out.println();
//        }

    }
}
