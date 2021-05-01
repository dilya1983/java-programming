package day24_loops;

public class WileLoopReverse {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        while (count >=0){
            System.out.println("count = " + count);
            count--;

        }
        System.out.println("That's it");

        int unreadSMS = 10;
        System.out.println("I have total " + unreadSMS +" unread sms");



        while (unreadSMS >= 0){
            System.out.println("Reading SMS : " + unreadSMS);
            --unreadSMS;

        }
        System.out.println("No more unread SMS message");
    }
}
