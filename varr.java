package SoftwareTesting;

public class varr {
    int a = 10;
    int b = 20;
    int c;
    void add(){
        c = a + b;
        System.out.println(c);
    }
        void square(){
            int s= 5;
            int area = s*5;
            System.out.println(area);
            System.out.println(c);
        }
    void display(){

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(area);
    }
    public static void main(String[] args) {
        varr obj = new varr();
        obj.add();
        obj.display();
        obj.square();
    }
}
