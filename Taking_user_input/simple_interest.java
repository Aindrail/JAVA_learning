package Taking_user_input ;
import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("\nEnter the principal\n");
        int principal = sc.nextInt();
        System.out.println("\nEnter the Rate\n");
        float rate = sc.nextFloat() ;
        System.out.println("\nEnter the Period of time\n");
        int time = sc.nextInt();
        float Simple_Interest = (principal* rate * time) / 100 ;
        System.out.println("\nThe simple interest is :" + Simple_Interest ); // here '+' is just like '&' used in c lang.
        System.out.println("\n The total amount to be paid is:" + (Simple_Interest+principal));
        sc.close();
    }
}
