package SoftwareTesting;

public class ternary {
    public static void main(String[] args) {
        int a = 8;
        boolean result = (a%2==0)?true:false;
        System.out.println(result);
        if(a%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
