package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] word = sentence.split(" ");
        System.out.println("1st word = " + word[0]);
        System.out.println("2nd word = " + word[1]);
        System.out.println("3rd word = " + word[2]);

        for (String w : word){
            System.out.println(w);
        }
        String googleResult = "About 1,810 result (0.68 seconds";
        String[] result = googleResult.split( "");
        System.out.println("Count = " + result[1]);
        System.out.println("Second = " + result[2]);
        System.out.println("Second = " + result[3]);
        //need to add from Murodil cod
    }
}
