package SoftwareTesting.encapsulation;

class bike1{
    final int speed = 60;
    void gear(){
        
        System.out.println("bike class run");
    }

}
class bajaj extends bike1{
    void gear(){
        System.err.println("bajaj class run");
    }
}
public class colour {
    public static void main(String[] args) {
        bajaj b = new bajaj();
        b.gear();
    }
}
