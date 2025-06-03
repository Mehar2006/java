class fileDownload extends Thread{
    String fileName;
     public fileDownload(String fileName){
        this.fileName=fileName;

     }
     public void run (){
        for(int i =1; i<=5;i++){
            System.out.println(fileName + " " + "downloading ...." + (i*20) +"%");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){}}
            System.out.println(fileName + " done");
        
     }
}
    class multithreaadingpart3 {
        public static void main(String[] args) {
            fileDownload t1 =new fileDownload("file A");
            fileDownload t2 = new fileDownload("file B");
            t1.start();
            t2.start();
        }
    }

