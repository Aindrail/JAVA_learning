package loops.forloop;
import java.util.Scanner;

public class sum_using_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("the the number till which you want to take the sum of");
        int n= sc.nextInt();
        for( int i = 0 ; i<=n ; i++){
            sum+=i;
        }
        int sum2 = 0;
        sum2 = (n)*(n+1)/2;
        System.out.println("the sum of n terms from 1 is :"+ " " +sum);
        System.out.println("the sum of n terms from 1 is :"+ " " +sum2);
        sc.close();

    }
    
}
