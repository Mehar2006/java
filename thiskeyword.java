public class thiskeyword {
    void sum(){
        System.out.println(this);
    } 
    public static void main(String[] args) {
        
    
        thiskeyword obj =new thiskeyword();
        System.out.println(obj);
        obj.sum();
        
    }
}
    

