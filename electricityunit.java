package SoftwareTesting;

import java.util.Scanner;

public class electricityunit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = s.nextInt();

        int amount = calculateBill(unitsConsumed);

        System.out.println("Amount to be paid: " + amount + " rupees");

        s.close();
    }

    public static int calculateBill(int units) {
        int amount = 0;

        if (units >= 0 && units <= 100) {
            amount = units * 1;
        } else if (units >= 101 && units <= 200) {
            amount = units * 2;
        } else if (units >= 201 && units <= 300) {
            amount= units * 3;
        } else if (units >= 301 && units <= 400) {
            amount = units * 4;
        } else if (units >= 401 && units <= 500) {
            amount = units * 5;
        } else if (units > 500) {
            amount = units * 7;
        }
        return amount;

    }
}
