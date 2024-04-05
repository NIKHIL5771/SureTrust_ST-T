package SoftwareTesting;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your total");
        int total = sc.nextInt();
        if(total >= 270 && total <= 300){
            System.out.println("Grade A");
        }else if(total >= 240 && total < 270){
            System.out.println("Grade B");
        }else if(total >= 200 && total < 240){
            System.out.println("Grade C");
        }else if(total < 200 && total >= 0){
            System.out.println("Grade D");
        }else{
            System.out.println("Invalid Data");
        }
    }
}
