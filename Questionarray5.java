
public class Questionarray5 {
    public static void main(String[] args) {
         int [] arr= { -4,0,5,5,0,0,-6};// output { 0,0,-4,-6,5,5,}

          int [] newArr = new  int [arr.length];
          int index=0;
          for(int i=0;i<=arr.length;i++){
            if(arr[i]==0){
                newArr[index++]=arr[i];
    


            }}
          
          for(int j=0;j<=arr.length;j++){
            if(arr[j]<0){
                newArr[index++]=arr[j];
                
    }

    
}
for(int k=0;k<=arr.length;k++){
    if(arr[k]>0){
        newArr[index++]=arr[k];
        
    }
    }
//  System.out.println("new array is : "+ Arrays.toString(newArr));
for(int x=0;x<arr.length;x++){

System.out.println(newArr[x]);
}
}
}


        
    
