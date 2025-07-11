package turing.lesson04;

import java.util.Scanner;

public class VendingMachineProductSelector {
    public static void selector(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product number:");
        int productNumber = sc.nextInt();

        switch (productNumber){
            case 1:
                System.out.println("Chocolate Bar - $2.00");
                break;
            case 2:
                System.out.println("Soda - $1.50");
                break;
            case 3:
                System.out.println("Chips - $1.20");
                break;
            case 4:
                System.out.println("Sandwich - $3.00");
                break;
            case 5:
                System.out.println("Water - $1.00");
                break;
            default:
                System.out.println("Invalid selection. Please enter a number between 1 and 5.");
        }
    }
}
