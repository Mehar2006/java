interface Client1{
    void show();
}
interface Client2{
    void show();
    void print();
}
class Hello implements Client1,Client2{
    public void show(){
        System.out.println("for both");
    }
    public void print(){
        System.out.println("for one");
    }
}
class multipleinhertance{
    public static void main(String[] args) {
        Hello h = new Hello();
        h.show();
        h.print();
    }
}
