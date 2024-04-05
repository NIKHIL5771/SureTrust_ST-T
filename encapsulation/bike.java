package SoftwareTesting.encapsulation;

public class bike {
    final int speed = 60;
    void run(){
        
        System.out.println("bike class run");
    }
    class ktm extends bike{
        void run(){
            System.err.println("ktm class run");
        }
    }    
    public static void main(String[] args) {
        ktm k = new ktm();
        k.run();   
    }
}
