package SoftwareTesting;

import java.util.Scanner;

public class ageinput {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = s.nextInt();

        if (age > 18) {
            
            System.out.print("Enter your height (in cm): ");
            int height = s.nextInt();
            System.out.print("Enter your weight (in kg): ");
            int weight = s.nextInt();

            System.out.println("Height: " + height + " cm");
            System.out.println("Weight: " + weight + " kg");
        } else {
            System.out.println("You must be 18 or older to provide height and weight details.");
        }
    }
}
