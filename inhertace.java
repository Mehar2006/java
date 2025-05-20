class Animal extends puppy{
    void eat(){
        System.out.println("eatingggggg");
    }
}

class Dog  extends puppy{
    void bark(){
         System.out.println("barkkkkkkkkkk");

    }
}

class puppy {
    void lazy(){
        System.out.println("cutieeeee");
    }
}




public class inhertace {
    public static void main(String[] args) {
        
        Animal obj =new Animal();
         obj.eat();
         obj.lazy();
         Dog d = new Dog();
         d.bark();
         d.lazy();
    }


    
}