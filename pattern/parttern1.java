package pattern;
import java.util.Scanner;
public class parttern1 {
    public static void main(final String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println(" Enter the size of the pattern");
     int n = sc.nextInt();
     for(int i = 0 ; i < n ;i++){
         for(int j  = 0 ; j < n ; j ++){
             System.out.print("* ");
         }System.out.println();
     }
     System.out.println("Have a nice day :) ");
   sc.close();

    }
    
}
