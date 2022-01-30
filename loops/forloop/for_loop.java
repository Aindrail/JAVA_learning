package loops.forloop;

public class for_loop {
    public static void main(String[] args) {
        for(int i=0 ; i<20; i++){ 
            System.out.println("Hello World"+ " " +i+1);// this will not increment the i value by one but it will print 1 after the value of i
            System.out.println("Hello World"+ " " +(i+1)); // this will increment the value of i by one and will not print 1 value after i
        }
    }
    
}
