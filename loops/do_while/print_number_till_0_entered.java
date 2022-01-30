package loops.do_while;
import java.util.Scanner;

public class print_number_till_0_entered { 
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Enter your number");
         num = sc.nextInt();
        System.out.println("The number you entered is "+num );
        }while( num != 0);
        sc.close();
    } 
    
    
}
