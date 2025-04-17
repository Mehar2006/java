public class sumofarray {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={1,2,3,4,5};
        int sum1=0;
        int sum2=0;
        int sum3=0;
        for(int i=0; i<5 ; i++)
        {
         sum1 = sum1+arr1[i] ;
        }
        System.out.println("the sum of first array is");
        System.out.println(sum1);
        for(int j=0; j<5;j++)
        {
       sum2=sum2+arr2[j];
        }
        System.out.println("the add of secnd array is");
        System.out.println(sum2);
    

    sum3=sum1+sum2;
    System.out.println("final answer");
    System.out.println(sum3);
    
}
}
