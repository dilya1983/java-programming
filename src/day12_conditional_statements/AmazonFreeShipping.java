package day12_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  your order total price");
        double totalPrice = scan.nextDouble();
        if (totalPrice >= 25.0) {
            System.out.println("Free shipping eligible. your order total: $ " + totalPrice);
        } else {

            System.out.println("NOT ELIGBLE FOR FREE SIPPING. YOUR TOTAL: $ " + totalPrice);
        }
        System.out.println("THANKS FOR SHOPPING AMAZON");
    }
}

