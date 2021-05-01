package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        String strPrise = "123.5";
        double price = Double.parseDouble(strPrise);
        if (price > 100) {
            System.out.println("expensive");
        }
        String sentence = "We wrote 100 lines of code";
        String[] word = sentence.split(" ");

        int linesOfCode = Integer.parseInt(word[2]);
        System.out.println("linesOfCode = " +linesOfCode);
    }
}


