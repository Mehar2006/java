import java.util.ArrayList;
import java.util.Collections;

public class frameworks {
    public static void main(String[] args) {
         ArrayList<String> arr=new ArrayList<>();//  this is Dynamic array 
         long start = System.nanoTime();// tell the time taken in nano sec
         arr.add("rahul");
         arr.add("mohit");// add element into the array
         arr.add("rohit");
         arr.add(0,"bano");//replace the element of array
         arr.remove(3);// remove the elemnts from the array with the particular index
         arr.set(1, "muskan");// update the element from the array
         System.out.println(arr);
         System.out.println(arr.get(2));
         System.out.println(arr.size());// tells the size of dynamic array
          System.out.println(arr.isEmpty());// check the array is empty or not
         System.out.println(arr.contains("rahul"));

         long end = System.nanoTime();
         System.out.println(end-start);


        //  Collections.sort(arr);
        //  System.out.println(arr);
        //  arr.clear();// delet all the elemt from the array
        //  System.out.println(arr);



         

        
    
}
}
