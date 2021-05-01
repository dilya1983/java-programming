package day25_loops;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();

        if(end <start){
            System.out.println("Reverse number is not supported");
        }else{
            for(int i = start; i <= end; i++){
                System.out.print(i+ " ");
            }

        }
    }
}
