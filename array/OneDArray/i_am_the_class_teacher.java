package array.OneDArray;

import java . util . Scanner;
public class i_am_the_class_teacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of students");
    int n = sc.nextInt();
int marks [] = new int [n];
System.out.println(" Enter the marks now");
for ( int i = 0 ; i< n ; i++){
    marks[ i ] = sc.nextInt();
}
float averageMarks = 0 ;
for ( int i = 0 ; i < n ; i++){
   averageMarks += marks[i];
}
averageMarks/=n;
System.out.println("The average marks of the student is = " +averageMarks);



sc.close(); 
    }
    
}
