package SoftwareTesting;

interface printable{
    void print();
}
interface showable{
    void show();
}
class w implements printable, showable{
    public void print(){
        System.out.println("Print method");
    }
    public void show(){
        System.out.println("Show method");
    }

}
public class draw {
    public static void main(String[] args) {
        w wr1 = new w();
        wr1.print();
        wr1.show();

        printable wr2 = new w();
        wr2.print();
        
        showable wr3 = new w();
        wr3.show();
    }
}
