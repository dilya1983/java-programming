package day09_scanner_practice;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double fahrenheit = scan.nextDouble();

        double celsius = ((fahrenheit - 32) * 5)/9 ;
        System.out.println(fahrenheit+" degree Fahrenheit is equal to "+celsius+" in celsius");

    }
}
