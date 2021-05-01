package day10_shorthand_operator;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much rent");
        double rent = scan.nextDouble();
        //scan.nextLine(); //extra line put .work - around (bug)
        String month = scan.nextLine();
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);

    }
}
