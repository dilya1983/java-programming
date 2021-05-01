package day13_conditional_statements;
import java.util.Scanner;
public class ATMPinCodeProgram {
    public static void main(String[] args){
        System.out.println("******* WELCOME TO TD BANK ATM ********");
        int secretPincode = 123456;
        System.out.println("Please enter your pin code");
        int inputPincode = 2345678;
        if(secretPincode == inputPincode){
            System.out.println("Welcome to you account");

        }else{
            System.out.println("Incorrect pin code");
            System.out.println("PLEASE TRY AGAIN!");

            System.out.println("thank you for using TD Bank ATM!");
        }

    }
}
