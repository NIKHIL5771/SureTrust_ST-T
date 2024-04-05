package SoftwareTesting;

class a {
    void message(){
        System.out.println("I am in class A");
    }
}
class b extends a{
    void mess1(){
        System.out.println("I am in class B");
    }
}
class c extends b{
    void mess2(){
        System.out.println("I am in class C");
    }
}
class d extends c {
    void mess3(){
        System.out.println("I am in class D");
    }
}
public class government {
    public static void main(String[] args) {
        
        d d1 = new d();
        d1.message();
        d1.mess3();
        d1.mess1();
        System.out.println();

        c c1 = new c();
        c1.message();
        c1.mess2();
        c1.mess1();
        System.out.println();

        b b1 = new b();
        b1.message();
        b1.mess1();
    }
}
