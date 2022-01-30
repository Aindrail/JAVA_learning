
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];
        for( int i = 0 ; i < size ; i++ ){
            arr[i]=sc.nextLong();
        }
        long K = sc.nextLong();
        for ( int i= 0 ; i < size ; i++){
            if( arr[i] == K){
                System.out.print(i);
            }
        }
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
sc.close();
    }
}

