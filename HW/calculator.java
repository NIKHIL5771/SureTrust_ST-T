package SoftwareTesting.HW;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = s.nextInt();
        System.out.println("Enter Number");
        int b = s.nextInt();

        int c = a+b;
        int d = a/b;
        int e = a*b;

        System.out.println("Addition"+' '+ c);
        System.out.println("Division"+' '+ d);
        System.out.println("Multipilication"+' '+ e);
        
    }
}
