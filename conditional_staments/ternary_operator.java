package conditional_staments;
import java.util.Scanner;
public class ternary_operator { // ternary operator is a shortcut method to if else statement
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("  Enter two number :");
        int a = sc.nextInt();        
        int b = sc.nextInt();
        int maxOfBothNumber = 0;
        maxOfBothNumber = a>b ? a: b;

        System.out.println(" Max of two numbers is :"+ maxOfBothNumber + "\n");
        sc.close();
    }
    
}
