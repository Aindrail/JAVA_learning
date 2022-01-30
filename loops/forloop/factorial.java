package loops.forloop;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        long  fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of which you want to take out the fatorial of:");
        int fact_num = sc.nextInt();
        for(int i = fact_num  ; i > 0 ; i--){
            fact *= i ;
        }
        System.out.println("The value of "+fact_num +" ! is : " +fact);
        sc.close();
        
    }

    
}
