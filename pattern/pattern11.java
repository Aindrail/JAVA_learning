package pattern;

import java.util.Scanner;



public class pattern11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      System.out.println(" Enter the size of the pattern");
      int n = sc.nextInt();
      for ( int i = 1 ; i<= n; i++){
          for ( int j = 0 ; j< i-1 ; j++){
              System.out.print("    ");
          }
          for( int j = 0 ; j < n-i+1 ; j++){
              System.out.print("* ");
          } 
      System.out.println();
    }
      sc.close();





    }
    
}
