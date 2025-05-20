class Student{
    Student(){
        System.out.println("ma hu na");
    }
    Student(int a){
        this();
        System.out.println(a);
    }
    Student( int a ,int b){
        this(5);
        System.out.println(a+b);

    }
    void sum(){
        System.out.println();
    }
}

public class chaning {
    public static void main(String[] args) {
        Student obj = new Student(2,5);
        obj.sum();
    }
}
