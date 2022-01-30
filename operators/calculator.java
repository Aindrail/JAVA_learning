package operators;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Enter the operation : "); // integer ke badd ek string input hum direct nahi le sakte so hume 
         sc.nextLine();
        char operation = sc.nextLine().charAt(0);

        float result =0;

        switch (operation){

            case '+':
            result =  a+b;
            break;  

            case '-' :
            result =  a-b ;
            break;

            case '*' :
            result =  a*b ;
            break;

            case '/' :
            result = (float) a/b ;
            break;

            default :
            System.out.println(" Entered input is not valid ");

        }
        System.out.println("The Result is :" + result );

        sc.close();

    }
    
}
