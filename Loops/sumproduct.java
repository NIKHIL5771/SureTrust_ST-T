package SoftwareTesting.Loops;

import java.util.Scanner;

public class sumproduct {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[4];
        System.out.println("Enter 4 numbers:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        int product = 1;

        for (int number : numbers) {
            sum += number;
            product *= number;
        }
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Product of the numbers: " + product);
    }
}
