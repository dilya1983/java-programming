package day10_shorthand_operator;

import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
       // String weather = "sunny";
        //String weather = scan.next();
        String weather = scan.nextLine();
        System.out.println(weather + " - is a nice day today!");


    }
}
