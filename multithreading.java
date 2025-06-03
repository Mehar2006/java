class MyThread extends Thread{ // this is 2nd thread
    public void run(){ // this is inbuilt run method
        System.out.println("hello");
    }

}

public class multithreading {  // main thread
    public static void main(String[] args) {
        MyThread t1 =new MyThread();
        t1.start();// this is inbuilt start method
        System.out.println("hiii");// firtly called main thread then run other 2nd thread
    }
    
}
