package day08_casting_scanner;
// balance 345.55
// price1 -> 20.88
//price2 -> 89.99
//price3 -> 15
// remainingBalance->calculate
// your initial balance:$345.55
// your remaining balance: $199.13
public class ShoppingBalanceCalculator {
    public static void main(String[] args) {

        double balance = 345.55;
        double price1  = 20.88;
        double price2  = 89.99;
        double price3  = 15;

        double remainingBalance = balance - price1 - price2 -price3;
        //double remainingBalance = balance -( price1 + price2 + price3);
        //  balance = remainingBalance;// 219.68
        System.out.println("Your initial balance: $" + balance);
        System.out.println("Your  remaining balance: $" +remainingBalance);

        //int balanceWithNoCent = 219;
        double balanceWithCent = 219.68;
        int balanceWithNoCent = (int)219.68;//219
        System.out.println(balanceWithNoCent);
    }


    }

