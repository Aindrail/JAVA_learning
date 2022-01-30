package operators;

public class bitwise {
    public static void main (String[] args) {
        // 5  --> 101
        // 6  --> 110
        // 4  --> 100 so bitwise amd operator of 5 and 6 is 4
        int a = 5;
        int b = 6;
         int c = a & b ;
         // bitwise OR operatoe down

        //  10  -->  1010
        //  13  -->  1101
        //  15  -->  1111
        int d = 10;
        int e = 13;
        int f = d | e;

         System.out.println(c);
         System.out.println(f);

         // Right Shift of 13 ie 1101 --> 0110 so it is 6 so 0110 --> 0011 that is 3 0011 --> 0001 that is 1 0001 --> 0000 that is 0
         // So it is observed that right shift means storing the unteger value after dividing with 2
         
         int g = e >> 1; // '>>' is the right shift operation
         int h = e >> 2;
         System.out.println(g);
         System.out.println(h);

         // Left shift operation is 13 vie 1101 --> 11010 that is 26 
         // So it gets doubled in left shift operator
         int i = e << 1; // '>>' is the right shift operation
         int j = e << 2;
         System.out.println(i);
         System.out.println(j);

        }
    
}
