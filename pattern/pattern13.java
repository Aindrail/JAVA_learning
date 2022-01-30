package pattern;

import java.util.Scanner;
public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
     System.out.println("Enter the size of the pattern ");
     int n = sc.nextInt();
     int rows = 2*n ; 
     for( int i = 1 ; i<=rows ; i++){
         if ( i ==1 || i==rows)
         {
             for ( int j = 0 ; j < n ; j++ )
             {
                 System.out.print("* ");
             }
             for ( int j = 0 ; j < n ; j++){
                 System.out.print(" *");
             }
         }
        else if ( i <= n){
            for ( int j = 1 ; j<= n-i+1 ; j++){
                System.out.print("* ");
            }
            for ( int j = 0 ; j < i-1 ; j++){
                System.out.print("    ");
            }
            for ( int j = 1 ; j <= n- i +1 ; j++){
                System.out.print(" *");
            }
        }
        
         else { 
     for ( int j= 0 ; j < i-n ; j++){
                 System.out.print("* ");
               }
             for ( int j = 0  ; j < rows - i ; j++  ){
                 System.out.print("    ");
                
                 
             }
             for ( int j = 0 ; j < i-n ; j++){
                 System.out.print(" *");
             }

         }

      System.out.println();
        }
 sc.close();   
    }
    
}
