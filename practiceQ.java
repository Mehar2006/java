import java.util.ArrayList;

public class practiceQ{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // Dynamic array

        // Add elements to the array
        arr.add(-2);
        arr.add(1);
        arr.add(-3);
        arr.add(4);
        arr.add(-1);
        arr.add(2);
        arr.add(1);
        arr.add(-5);
        arr.add(4);

        // Find maximum subarray sum 
        int currentSum = arr.get(0);
        int maxSum = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            int currentElement = arr.get(i);

            if (currentSum + currentElement > currentElement) {
                currentSum = currentSum + currentElement;
            } else {
                currentSum = currentElement;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}
