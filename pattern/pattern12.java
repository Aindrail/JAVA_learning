package pattern;

import java.util.Scanner ;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the size of the pattern");
        int n = sc.nextInt();
        int rows = 2*n - 1; 
        for ( int i = 1 ; i<=rows ; i++){
            if( i <= n){
            for ( int j= 0 ; j <n-i; j++){
                System.out.print("  ");
            }
            for( int j = 0 ; j < i ; j++){
                System.out.print("* ");
            }}
            else {
                for( int j = 0;   j < i-n ; j++){
                      System.out.print("  ");
                }
                for( int j = 0 ; j < rows-i+1 ; j++)
                {
                    System.out.print("* ");
                }
            }System.out.println();
        } sc.close();

    }
    
}
