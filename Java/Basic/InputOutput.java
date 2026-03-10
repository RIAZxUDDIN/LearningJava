package Basic;
import java.util.*;

public class InputOutput {
    public static void main(String[] args){
        System.out.println("First Program in java!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("\nHello Mr. "+ name+"."+ "\tYou entered your age "+age);
    }
}
