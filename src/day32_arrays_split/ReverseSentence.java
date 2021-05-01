package day32_arrays_split;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = " today is java ";
        String[] word  = sentence.split(" ");
        System.out.println(Arrays.toString(word));
        String reversed = "";
        for(int i = word.length-1; i >= 0; i--){
            reversed += word[i] + " ";

        }
        System.out.println("sentence = " + sentence);
        System.out.println("reversed = " + reversed.trim());


    }
}
