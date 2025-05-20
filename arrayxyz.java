public class arrayxyz {
    public static void main(String[] args) {
       int [][] arr ={{1,2,3,4},{1,2,3,4}};
       int totalcount=0;
       int[] arr1 = new int[8];
       int m=0;

       for(int i=0;i<arr.length;i++){
        totalcount=totalcount+arr[i].length;
       }
       System.out.println(totalcount);
    //     for(int i=0; i<arr.length;i++){
    //    for(int j=0; j<arr[i].length;i++){
    //     System.out.println("hehe");
    //     totalcount++;

       
       for(int j=0; j<arr1.length;j++)
       {
        for(int k=0;k<arr[j].length;k++)
        {
            arr1[m++]= arr[j][k];
            // System.out.println(arr1[m]);
           
        }
         System.out.println(arr1[m]);
        
       
       }
       
    }
}
/// not completed

    
    

