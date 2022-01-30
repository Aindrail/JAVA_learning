package loops.forloop;
import java.util.Scanner;

public class table_using_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want the table of :");
        int n = sc.nextInt();
        System.out.println("The table of "+ n +" is :-");
        for(int i=0 ; i<10 ; i++){
            System.out.println( n +" * " +(i+1) +" = " +(n*i));
        }
        System.out.println("This is the end of your table" + "\n" +"Have a nice day :)");
        sc.close();
    }
    
}
