class Student{
    String name="rahul";
    int age=17;

    Student(String name, int age)// string n.int a (local variable)
    {
        name=name;
        age=age;
        System.out.println(name+"  "+ age);
    }
    void eat(){
        System.out.println("hiiiiiiiii");
    }
}
public class objandclass {
    public static void main(String[] args) {
    Student obj=new Student("rohit",18);// n ,a (local variable)
    System.out.println(obj. name);
    System.out.println(obj. age);
    }
}
