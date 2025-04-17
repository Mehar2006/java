//how to take input in array
import java.util.Scanner;
public class outputinarray {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("enter the length of array");
        int n=in.nextInt();
        int [] arr =new int[n];
        System.out.println("enter the value of array");
        for(int i=0;i<n; i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("original array");

        for(int k=0; k<arr.length; k++ ){

            System.out.println(arr[k]);
         }
         System.out.println("reverse array");

       for(int j=n-1; j>=0; j-- ){

        System.out.println(arr[j]);
     }
  
    
} } 
