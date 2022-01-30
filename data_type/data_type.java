 package data_type ;
 
 public class data_type {
    public static void main( String[] args) {
         byte x = -128;
         byte y = 127;// byte z =128; ||byte z = -129; not possible
         int age = 10;
         float rate_of_interest = 2.3f;// f at last is important if not it will assume it as double so f is used as manual type conversion 
         double rate = 3.1428571;
         boolean abbol = true;
         char myCharacter = 'a';

          System.out.println(y);
          System.out.println(x);
          System.out.println(age);
          System.out.println(rate);
          System.out.println(myCharacter);
          System.out.println(abbol);          
          System.out.println(rate_of_interest); 
          

    }
    
}
