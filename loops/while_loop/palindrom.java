package loops.while_loop;
import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number ");
     double num = sc.nextDouble();
     double temp = num ;
     double reversenum = 0 ;
     while ( temp > 0 ){
         double lastdigit = temp % 10 ;
         reversenum = reversenum * 10 + lastdigit ;
         temp=(int) temp/10;
}
if ( reversenum == num){
    System.out.println( "The number is a palindrom ");
} else 
System.out.println( "The number is not  a palindrom");

System.out.println("Have a nice day :)");

 sc.close();


    }
    
}
