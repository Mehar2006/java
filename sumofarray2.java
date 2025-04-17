public class sumofarray2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        int[] sum= new int[ arr1.length];

        for( int i=0; i<arr1.length; i++)
        {
            sum[i]=arr1[i]+arr2[i];
        }
        System.out.println("the addition of array");
         for(int k=0; k<5;k++){
             System.out.println(sum[k]);
         }
            
        

    }
    
}
