package array.twoDArray;

 import java.util.Scanner;
public class matricemulitipication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the rows number");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of coloumns");
        int cloms = sc.nextInt();
        System.out.println("Enter the the rows number");
        int rows2 = sc.nextInt();
        System.out.println("Enter the no. of coloumns");
        int cloms2 = sc.nextInt();
        int a [][] = new int [rows][cloms];
        int b [][] = new int [rows2][cloms2];
        int mult [][]= new int [rows][cloms2]; int pro = 0;
        for ( int i = 0 ; i< rows ; i++){
            for ( int j = 0 ; j < cloms ; j ++){
                System.out.println("Enter the value of " +(i+1) + " row and " +(j+1) + " coloum of the 1 st matrices");
                a[i][j] = sc.nextInt();
            }
        }
        for ( int i = 0 ; i< rows2 ; i++){
            for ( int j = 0 ; j < cloms2 ; j ++){
                System.out.println("Enter the value of " +(i+1) + " row and " +(j+1) + " coloum of the 2 st matrices");
                b[i][j] = sc.nextInt();
            }
        }
if ( cloms == rows2 ){
    for ( int i=0 ; i<rows  ;i++  ){
        for( int j = 0   ; j<cloms2   ; j ++  ){
            for ( int k = 0 ; k<rows2 ; k++){
            pro+= a[i][k] * b[k][j];

        }
        
          mult[i][j] = pro;
        pro = 0;
    }
        
    }



}
else {System.out.println("The multiplication of the two matrices is not possible");
System.exit(0);}
System.out.println("The elements of the multipicated matrice are" );
for ( int i = 0 ; i< rows ; i++){
    for ( int j= 0 ; j < cloms2 ; j++){
        System.out.print(mult[i][j] +"    ");
    } System.out.println();
    System.out.println();
    System.out.println();
}
System.out.println();
System.out.println();
System.out.println("Have a nice day :)");
System.out.println();
System.out.println();
sc.close();


    }
    
}
