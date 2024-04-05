package SoftwareTesting.encapsulation;

class place{
    String color = "white";
    place(){
        System.out.println("This place is connstructor");
    }
    void capital(){
        System.out.println("the capital is place");
    }
}
class hyderabad extends place{
    String color = "Black";
    hyderabad (){
        super();
        System.out.println("This is hyderabad constructor");
    }
    void capital(){
        System.out.println("the capital is hyderabad");
    }
    void print(){
        super.capital();
        System.out.println("the color of place" + super.color);
        System.out.println("the color of hyderabad " + color);
    }
}
public class production {
    public static void main(String[] args) {
        hyderabad h = new hyderabad();
        h.print();    
          
        h.capital();
    }
    
}
