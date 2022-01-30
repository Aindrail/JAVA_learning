package conditional_staments;
import java.util.Scanner;
public class nested_if_else {
      public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
     System.out.println("enter the numbers" );
     int a = sc.nextInt();

     int b = sc.nextInt();
     int c = sc.nextInt();
     int greatest_number;  
     if(a>b){
         if(a>c){
             greatest_number = a;
            }else greatest_number = c;
        }else{ 
          
     if(b>c)
     { greatest_number=b;

         }else greatest_number = c;}
          System.out.println("The greatest number is :"+ greatest_number + "\n");
          
     // Shortcut method of this whole using ternary operator

     greatest_number = a > b ? a > c ? a : c : b > c ? b : c ;
     System.out.print("The greatest using terniary operator is also:" +greatest_number + "\n");

     sc.close();
        }

      
      }



