package String;
import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0, j = str.length() - 1, flag = 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = 0;
                break;
            }
            i++; j--;
        }
        if (flag == 1) {
            System.out.println(str + " is a palindrom");
        }
        else {
            System.out.println(str + " is not a palindrom");
        }

    }
}
