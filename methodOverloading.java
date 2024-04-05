package SoftwareTesting;

class addition{
    static int add(int a, int b){
        return a+b;

    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static float add(float a, float b){
        return a+b;
    }
    static float add(float a, float b, float c){
        return a+b+c;
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        System.out.println(addition.add(34, 6f, 67)); 
    }
}
