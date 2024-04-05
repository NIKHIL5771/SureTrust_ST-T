package SoftwareTesting;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username : ");
        String name = sc.nextLine();
        System.out.println("Enter your age : ");
        
        int age = sc.nextInt();
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);

        if(age >= 18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }

    }
    
    
}
