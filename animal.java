package SoftwareTesting;

public class animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}
    class dog extends animal{
        void bark(){
            System.out.println("Dog is barking");
        }
    }
        class cat extends dog{
            void veep(){
                System.out.println("Cat is veeping");
            }
        
    
    public static void main(String[] args) {
        // animal obj = new animal();
        // obj.eat();

        // dog obj1 = new dog();
        // obj1.eat();
        // obj1.bark();

        cat c1 = new cat;


    }
}
