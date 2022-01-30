package loops.forloop;

import java.util.Scanner ;

public class series_sum_2 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of n for which the value of 1/1 - 1/2 + 1/3 - 1/4 + 1/5 -......1/n");
     int n = sc.nextInt();
     float sum =0;
     for(float i = 1 ; i<=n ; i++){
         if( i%2==0){
             sum-=1/i;
         }else {sum+=1/i;}
     }
     System.out.println("The sum of the series 1/1 - 1/2 + 1/3 - 1/4 + 1/5 -......1/" +n +" is :" +sum);
     System.out.println(" Have a nice day :)");
     sc.close();

 }
  
     
    
}
