package loops.forloop;
import java.util.Scanner;

public class prime_number_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
    if (num <= 2){
        System.out.println( +num +" is prime");
    }
else{
        for( int i =2; i * i< num ; i++){
            if(num%i==0)
               { System.out.println( num +" is not prime");
               System.out.println("The first number which it is divisible is "+i);
                System.exit(0);}
            
        }
            System.out.println( +num +" is prime");
        }
        sc.close();
        
    }
}
