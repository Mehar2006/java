class student{
    int a;
    student(int a){
        this .a=a;
    }
    void sum(){
        System.out.println(a);
    }
    
}

public class thisproblem {
    public static void main(String[] args) {
        student obj=new student (20);
        obj.sum();

    }
    
}
