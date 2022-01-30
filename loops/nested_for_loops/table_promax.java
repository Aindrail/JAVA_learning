package loops.nested_for_loops;

import java.util.Scanner;

public class table_promax {
    public static void main(final String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number till which you want to take the table of:");
         int n= sc.nextInt();
         for(int i =1; i<=n ; i++){
             System.out.println("The table of " +i +" is :");
             for( int j =1 ; j<=10 ; j++){
                 System.out.println(i +" * "+j +" = "+(i*j)  );
             }
         }System.out.println(" Your table till "+n +" is printed" +"\n" +" Have a nice day :)");
         sc.close();
    }
    
}
