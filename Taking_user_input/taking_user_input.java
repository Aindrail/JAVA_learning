package Taking_user_input ;
import java.util.Scanner;
public class taking_user_input {
    public static void main(String[] args){
       Scanner sI = new Scanner(System.in);
       Scanner sStr = new Scanner(System.in);
       int x= sI.nextInt();
       String str = sStr.nextLine();
       System.out.println(x);
       System.out.println(str);
       sI.close();
       sStr.close();
    }
    
}
