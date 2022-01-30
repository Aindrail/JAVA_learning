package operators;
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
       
        int dayOfweek;
        System.out.println("enter the no. of day you need (1 for sunday and 7 for saturday)");
       Scanner sc = new Scanner(System.in);
        dayOfweek = sc.nextInt();
        // if (dayOfweek== 1)
        // {

        // }
        // if (dayOfweek== 2)
        // {
            
        // }
        // if (dayOfweek== 3)
        // {
            
        // }
        // if (dayOfweek== 4)
        // {
            
        // }
        // if (dayOfweek== 5)
        // {
            
        // }
        // if (dayOfweek== 6)
        // {
            
        // }
        // if (dayOfweek== 7)
        // {
            
        // }

       switch ( dayOfweek){
           case 1 :
           case 7 :
           System.out.println("So ja bhai aaj chutti hai \n");
           break;

           case 2 :
           case 5 : 
           System.out.println(" bhai bohut boring day hai veg bhi khana hai \n");
           break;

           case 3 :
           case 4 :
           System.out.print(" bhai aaj non veg congo bhai KFC jaenge . Par paisa hai to ?");
           break;

           default :
           System.out.println("bhai jaisa chall raha hai waise chalte jaega life . Just enjoy your life");
           
       } 
        sc.close();
        

    } 
    
}
