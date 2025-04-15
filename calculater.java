import java.util.*;
public class calculater {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("enter first number");
        int a= in.nextInt();
        System.out.println("enter second number");
        int b= in.nextInt();
        System.out.println("enter third number");
        char c= in.next().charAt(0);
        switch(c)
        {
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '%':
            System.out.println(a%b);
            break;

            default:
            System.out.println( "invalid input put");
        }


    }
}




