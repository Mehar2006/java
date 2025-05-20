 class parent{
    void sum( int a, int b){
        
        System.out.println(a+b);
    }
     void sum(int a,int b,int c){
       System.out.println(a+b+c);

     }
}
 
 public class finctionoverloading {
    public static void main(String[] args) {
        parent obj=new parent();
        obj.sum(5,5);
         obj.sum(1,3,5);
    }
    
}
