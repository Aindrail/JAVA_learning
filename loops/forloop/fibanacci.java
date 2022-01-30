package loops.forloop;

import java.util.Scanner;

public class fibanacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fibogassi limit ");
        int n = sc.nextInt();
        int a = 0 , b = 1;
        System.out.println("The fabogassi series of "+n +" is:");

    if(n==1){ System.out.println(a);}
      else System.out.print( a +" "+ b +" ");
        for( int i=0; i< (n-2); i++ ){
            int c = a+b;
            System.out.print(c +" ");
            a=b;
            b=c;
        }
        System.out.println("\nThat's the end.Have a nice day:)");
        sc.close();
    }
    
}
