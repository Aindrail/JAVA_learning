package operators;

public class arithmatic {
    public static void main( String[] args){ 
        int a = 23;
        int b = 45;
        int c = a * a + b * b + 2 * a * b ;
        int d = (a+b) * (a+b);
        int e = b/a;
        int f = b%a ;
        int g = a%b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(c + " " +d +" " +e + " " +f +" " + g +" \n" ); // this is like using cout>> a>> b>> c; so  use '+' instead of '<<'


    }
}
