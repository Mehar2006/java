class Parent {
    void eat(){
        System.out.println("maggiee");
    }
}
    class Child extends Parent{
        void eat(){
            System.out.println("pastaaa");
           // super.eat();
        }
    }
    class functionoverriding{
        public static void main(String[] args) {
            Parent obj = new Child();
            obj.eat();
        }
    }
