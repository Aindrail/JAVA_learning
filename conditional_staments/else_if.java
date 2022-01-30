package conditional_staments;

public class else_if {
    public static void main(String[] args) {
        int number = 32;
        if( number<= 10){
            System.out.println("the no lies between 10 \n");
         } else if( number > 10 && number <=20){
                System.out.println("the no. lies between 10 to 20 \n");

            } else if ( number > 20 && number <=30){
                System.out.println("the no. lies between 20 to 30 \n");
            } else System.out.println("the no. is grater than 30 \n");
        }
    }
    

