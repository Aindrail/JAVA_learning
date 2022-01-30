package pattern;
import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      System.out.println(" Enter the size of the pattern");                  
      int n = sc.nextInt();                                                   
      for(int i = 1 ; i <= n ; i++){                                           
          for(int j  = 1 ; j <= i-1 ; j ++){                                    
             System.out.print("   "); // for spaces in front
             }
             for( int j =1 ; j<=n-i+1 ; j++){
                 System.out.print("*  ");
             }
             
         System.out.println();
      }
      System.out.println("Have a nice day :) ");
    sc.close();

    }
    
}
