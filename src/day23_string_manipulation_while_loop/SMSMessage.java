package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [ Murodil ] From Number<+(202) 375-1774> Message:{Hello, lets code some java}";
        int strat = message.indexOf("[");
        int end = message.indexOf("]");
        message.substring(strat,end);
        System.out.println(message.substring(strat+1, end));
        String sender = message.substring(strat+1, end);
        System.out.println("sender = " + sender);
        
         String mobile = message.substring( message.indexOf("<")+1, message.indexOf(">"));
         System.out.println("mobile = " + mobile);

         String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
         System.out.println("text = " + text);

        System.out.println(" Fikret ".trim());
        sender =sender.trim();
         if (sender.equals("Muradil")) {
             System.out.println("Message from muradil about homework");
         }else {
             System.out.println("Someone else message");
         }
    }
}
