package loops.while_loop;
import java.util.Scanner;

public class sumofdigitsofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        double num = sc.nextInt() ; int sum=0;
        while ( num >=1 ){
        sum += num % 10 ;
        num /= 10;
        
    
    
        }
        System.out.println(" The sum of digit of the number is : "+sum);
        System.out.println("Have a nice day :)");
    sc.close();
    
    
    
    }
    
}

