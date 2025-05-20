class student(){
    student(){
        System.out.println("tum nhi ho ");

    }
    student(int a){
        this();
        System.out.println(a);
    }
    student(int a,int b){
        this(5);
        System.out.println(a+b);
    }
    void sum(){
        System.out.println("sum");
    }
}


class ArithmathicO {
    public static void main(String[] args) {
        student obj=new student(2,5);
        obj.sum();

    }

}