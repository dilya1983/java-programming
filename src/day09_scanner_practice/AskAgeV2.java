package day09_scanner_practice;


import java.util.Scanner;

public class AskAgeV2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//Create scanner object
        System.out.println("How old are you");
        int age = scan.nextInt();// int age =24
        System.out.println(age+ "-That is great age!");
        //scan.close(); optionally close the scan
    }
}
