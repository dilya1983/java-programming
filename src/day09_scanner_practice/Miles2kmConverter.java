package day09_scanner_practice;


import java.util.Scanner;

public class Miles2kmConverter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("####### MILES TO KM CONVERTER #######");
        System.out.println("Enter mails:");
        //double mails = 10.0;
        double mails = scan.nextDouble();
        double kilometers = mails * 1.609;
        System.out.println (mails + " kilometers: " + kilometers);

        }
    }

