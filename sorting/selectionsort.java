package sorting;

public class selectionsort {
    public static void main(String[] args) {
        int a[] = { 2, 1, 8, -3, 6,4 ,12};
        int n = a.length;
        for ( int i = 0 ; i< n-1 ; i++){
            int minInd =i ;
            for( int j = i ; j < n-1 ; j++){
                if ( a [j] < a[minInd]){
                    minInd=j;
                }
            }
            int temp = a[i];
            a[i] = a[minInd];
            a[minInd] = temp;
        }
        for( int e : a){
            System.out.print(e + "  ");
        }
    }
    
}
