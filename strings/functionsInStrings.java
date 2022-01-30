package strings;


public class functionsInStrings {
    public static void main(String[] arg){
String  name = "Aindrail Santra";
String name2 = new String("Aindrail Santra");
String  name1 = "Aindrail ";
name1 += "Santra "; // for concating the strings value
String cars = "Hyundai,Maruti,Ferrari,Audi,Lamborghini,Bentley,Tesla";
String name4 = "          Aindrail               ";
String allcars[] = cars.split(",");
for ( String car: allcars){
    System.out.println(car);
}
System.out.println(name1);
System.out.println(name.charAt(5));
System.out.println(name.length());
System.out.println(name.substring(4));
System.out.println(name.substring(4 , 12));
System.out.println(name.contains("X"));
System.out.println(name.equals(name2));
System.out.println(name.isEmpty());
System.out.println(name.concat(" is the best"));
System.out.println(name.replace('A' , 'X'));
System.out.println(name.indexOf('j'));
System.out.println(name.toLowerCase());
System.out.println(name.toLowerCase());
System.out.println(name4 + ".\n"  +name4.trim());






    }
    
}
