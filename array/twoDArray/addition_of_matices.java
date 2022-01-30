package array.twoDArray;
import java . util .Scanner;

public class addition_of_matices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows = sc .nextInt();
        System.out.println("Enter the numbers of coloumns");
        int coloumns = sc.nextInt();
   int a [][] = new int [rows][coloumns];
   int b [][] = new int [rows][coloumns];
   for ( int i = 0 ; i < rows ; i ++){
   for ( int j = 0 ; j< coloumns ; j ++) {
       System.out.println("Enter the element of " +(i+1) +"rows and " +(j+1) +" coloumn of the 1st matrice" );
       a[i][j] = sc.nextInt();


   }}
   for ( int i = 0 ; i < rows ; i ++){
    for ( int j = 0 ; j< coloumns ; j ++) {
        System.out.println("Enter the element of " +(i+1) +"rows and " +(j+1) +" coloumn of the 2nd matrice" );
        b[i][j] = sc.nextInt();
 }
       
   }
    int c [][] = new int [rows][coloumns];
    for ( int i = 0 ; i < rows ; i ++){
        for ( int j = 0 ; j< coloumns ; j ++) {
        c[i][j] = a[i][j] + b [i] [j] ;
     }
           
       }
       for ( int i = 0 ; i < rows ; i ++){
        for ( int j = 0 ; j< coloumns ; j ++) {
        System.out.print( c [i][j] +" ");
     } System.out.println();
           
       }
       sc.close();






    }
    
}
