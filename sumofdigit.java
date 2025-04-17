public class sumofdigit {
    public static void main(String[] args) {
        int a=123;
        int sum=0;
        while(a>0){
          sum=sum+a%10; // a%10=123%10=>3
          a=a/10;//remove last digit
    
        }
        System.out.println(sum);

    }
    
}
