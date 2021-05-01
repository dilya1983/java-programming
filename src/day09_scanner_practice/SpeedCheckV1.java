package day09_scanner_practice;

import java.util.Scanner;

public class SpeedCheckV1 {
    public static void main(String[] args){
        int speedLimit = 55;
        int currentSpeed = 70;
        int overLimit = currentSpeed - speedLimit;
        System.out.println(" You are driving "+ overLimit + " mph over the limit. Slow down");

    }
}
