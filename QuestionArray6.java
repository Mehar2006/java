import java.util.Arrays;

public class QuestionArray6 {
    public static void main(String[] args) {
       

 {
    
        int[] arr = {1,2,3,4,5};
        for(int i=arr.length-1;i>0n;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=arr.length;
        System.out.println("new array is:"+Arrays.toString(arr));
        

    }
}
    }

