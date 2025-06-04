// thread using runnableinterface



class MyRunnable implements  java.lang.Runnable{
    public void run(){
        System.out.println("thread using runnable interface");
    }
}

public class exampleofmultithreading { 
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
        try{
            t1.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i=1;i<5;i++){
            System.out.println(i);
        }
        System.out.println("main thread is running");
        
    }
    
}
