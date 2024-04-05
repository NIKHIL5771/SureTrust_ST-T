package SoftwareTesting;

public class counter {
    int count = 0;
    
    counter(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        counter a = new counter();
        counter b = new counter();
        counter c = new counter();
    }
}
