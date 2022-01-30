package strings;

public class anagraminmoreoptimization {
    public static void main(String[] args) {
        String a = "aabbc";
        String b = "abab";
        boolean isAnagram = false;
        int al[] = new int [256];
        if( a.length() == b.length()){
        for( char c : a.toCharArray())
        {
            int index = ( int)c;
            al[index]++;
        }
        for( char c : b.toCharArray())
        {
            int index = ( int ) c ;
            al[index] --;
        }
        for ( int i = 0 ; i<256 ; i++){
            if( al[i ] !=0){
                
                isAnagram = false;
                break;
            }
        }}
        if(isAnagram){
            System.out.println("The strings are anagram");
        }
        else { 
            System.out.println("The strings are not anagram");
        }
        }
    }
    

