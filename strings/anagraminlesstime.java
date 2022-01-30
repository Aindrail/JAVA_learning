package strings;

public class anagraminlesstime {
    public static void main(String[] args) {
        String a = "cuttack";
        String b = "attack";
        int al[] = new int [256];
        int bl[] = new int [256];
 if(a.length() == b.length()){       
for( char c : a.toCharArray())    //will return char array 
{
    int index = ( int ) c;
    al[index] ++;

}
for ( char c : b.toCharArray())
{
int index = ( int ) c;
bl[index]++;

}
for( int i = 0 ; i < 256 ; i++){
    if( al[i] != bl [i]){
        System.out.println("The strings are not anagram");
        System.exit(1);
    }
    
    }}else{ System.out.println("The strings are not anagram");
System.exit(1);}
System.out.println("The strings are anagram");

    }
    
}
