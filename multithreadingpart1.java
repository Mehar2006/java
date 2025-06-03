class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
        try{
        Thread.sleep(2000);
        }
        catch(Exception e){
            
        }
            System.out.println("hiii");
        
    }
}




public class multithreadingpart1 {
    public static void main(String[] args) {
        MyThread t1 =new MyThread();
        t1.start();
        
    }
    
}
