package pattern;
import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of the pattern");
        int n = sc.nextInt();
        for(int i = 1 ; i <=n ;i++){
            if( i==1 || i == n){
                for ( int j = 0 ; j<i ; j++){
                    System.out.print("* ");
                }
            }else {
                System.out.print("*");
                for( int j=0 ; j<2*(i-1)-1 ;j++ ){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Have a nice day :) ");
      sc.close();
        
    }
    
}
