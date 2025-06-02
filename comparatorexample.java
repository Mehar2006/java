import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student {
    int rollN;
    String name;
    int age;
     public Student(int rollN, String name, int age){
        this.age=age;
        this.name=name;
        this .rollN=rollN;
     }
     public String toString(){
        return age + " "+ name+" "+ rollN;
  
     }}

class SortbyName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
 }

public class comparatorexample {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(58, "rahul", 13));
        list.add(new Student(55, "rohit", 17));
        list.add(new Student(67, "arpit", 22));
        list.add(new Student(113, "xyz", 19));
        Collections.sort(list,new SortbyName());
        for(Student s: list){
            System.out.println(s.toString());
        }
        
    }
    
    
}
