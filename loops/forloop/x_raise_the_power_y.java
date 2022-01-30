package loops.forloop;
import java.lang.Math;
import java.util.Scanner ;

public class x_raise_the_power_y {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int result =1;
        System.out.println("Enter the value of the number whose power is to be taken out");
         int x = sc.nextInt();
         System.out.println("Enter the power variable");
         int y = sc.nextInt();
         System.out.println("The value of " +x +" ^ " +y +" is :" );
        
         if(y==0){ System.out.println(result);}
        for(int i = 0 ; i< y ; i++){
           
           result*=x;
     
        }
        System.out.println( result );
        System.out.println(Math.pow(x, y));
        sc.close();
        
    }
    
}
