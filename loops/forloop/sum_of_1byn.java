package loops.forloop;
import java.util.Scanner;

public class sum_of_1byn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n for the series 1/1+ 1/2 + 1/3 + 1/4 + ... + 1/n");
        int n = sc.nextInt();
        float sum=0;
        for( float i=1 ; i<=n ; i++){
            sum+=1/i;
        }
        System.out.println("the sum of  1/1+ 1/2 + 1/3 + 1/4 + ... + 1/" +n +" is :"+sum);
        sc.close();
    }
    
}
