package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args){
        int currentSpeed, speedLimit;
        boolean isSpeeding;

        currentSpeed = 4_5;//45
        speedLimit = 5_5;//55
        isSpeeding = speedLimit < currentSpeed;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");
        //45 + 20 -> 65

        speedLimit += 20;


        isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("can I afford? - " + (accountBalance >= itemPrice));//true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can afford = " + canAfford);

        //decrease balance by itemPrice. using shorthand operator
        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;

        boolean isBroke =accountBalance <= itemPrice;
        System.out.println("Am I Broke? -  = " + isBroke);




    }
}
