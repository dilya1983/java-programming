package day21_string_manipulation;

import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word);

        word = word.replace("hub","lab");
        System.out.println("word = " + word);

        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ","");
        System.out.println("withNoSpaces = " + withNoSpaces);

        String word2 = "java";
        System.out.println(word2.replace("java","selenium") );

        sentence = sentence.replace("java","selenium").replace("fun"," a lot of fun");
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4.000 results for java book";
        result = result.replace("1-48 of over","")
                .replace(",","")
                .replace("results for java book","");

        System.out.println("result = " + result);
        int count = Integer.parseInt(result);
        count++;
        if (count > 0) {

            System.out.println("search success");
        }


    }

}
