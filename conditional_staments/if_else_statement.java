package conditional_staments;
import java.util.Scanner;

public class if_else_statement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no. of petals in your flower \n");
        int noOfpetals= sc.nextInt();
        if(noOfpetals % 2 ==0){
            System.out.println("He loves me not\n");
        } else {
            System.out.println("He love me\n");
        }
        sc.close();
    }
    
}
