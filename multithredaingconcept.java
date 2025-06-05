class multithredaingconcept{
     public static void main(String[] args) {
        System.out.println("idher dekho");
        Thread t1 = new Thread( ()->{
            System.out.println("hello");
      
        try{ 
             
        Thread.sleep(2000);
       
        }
        catch(ExceptionInInitializerError e) {
            e.printStackTrace();
        
             
        }
         System.out.println("nooooooo");});
        
        Thread t2 = new Thread(() ->{
            System.out.println("hiii");
        });
        t1.start();
        t2.start();
     }
}