package pattern;

import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of the pattern");
     int n = sc.nextInt();
     for(int i = n ; i > 0 ;i--){
         for(int j  = 0 ; j < i ; j ++){
             System.out.print("* ");
         }System.out.println();
     }
     System.out.println("Have a nice day :) ");
   sc.close();


    }
    
}
