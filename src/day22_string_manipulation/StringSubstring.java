package day22_string_manipulation;

import java.util.Locale;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        System.out.println(word.substring(0, 4));
        System.out.println(word.substring(0, 7));
        System.out.println(word.substring(5, 7));
        System.out.println(word.substring(8, 11));

        System.out.println(word.substring(8));
        System.out.println(word.substring(5));
        //              0123
        String word2 = "java";
        System.out.println(word2.substring(0,2));
        System.out.println(word2.substring(2,4));
        System.out.println(word.substring(1,3));
        System.out.println(word2.substring(1));
        System.out.println(word.substring(0,1));

         //              01234567
        String word3 = " love you";
        System.out.println(word3.substring(0,9));
        System.out.println(word3.substring(2, 4));
        System.out.println(word3.substring(3,5));
        System.out.println(word3.substring(4,6));
        System.out.println(word3.substring(5, 9));

        String word4 = "love";
        System.out.println(word4.substring(0,word4.length()-1));

        }
    }

