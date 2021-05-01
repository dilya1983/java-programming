package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        // if(isHungry == true) {
        if (isHungry = true) {
            System.out.println("I am hunger I will go get something to eat?\nThen code Java");
        } else {
            System.out.println("I am not hungry,I will keep coding java!");


            double price = 130.44;
            boolean isAffordable = price <= 200.0;

            System.out.println("isAffordable = " + isAffordable);
            if (isAffordable) {
            } else {
                System.out.println("Too expensive, lets keep coding java");

                boolean isRemoteJob = true;
                if (isRemoteJob != true) {
                    System.out.println("Sorry, I am not interested");
                } else {
                    System.out.println("Sure, Iam interested, what is interview process");

                }
            }
        }

    }
}