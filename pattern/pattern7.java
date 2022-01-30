package pattern;
import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of the pattern");
        int n = sc.nextInt(); int sum=0;
        for(int i = 1 ; i <= n ;i++){
            for(int j  = 0 ; j < n-i ; j ++){
                System.out.print("  ");
            }
            for( int j =0 ; j< i ; j++){
                System.out.print( ++sum +"   " );   // we can also use sum++ but we have to initialise sum = 1
            }
            System.out.println();
        }
        System.out.println("Have a nice day :) ");
      sc.close();
        
    }
    
}
