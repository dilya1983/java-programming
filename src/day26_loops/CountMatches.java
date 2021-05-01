package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'a';
        int count = 0;

        for(int i = 0; i <word.length(); i++){
            if(letter == word.charAt(i) ){
                count++;
            }
        }
        System.out.println("there are " + count + " " + letter +"'s in " + word);

//                    0123456
        String str = "Camille";
        int num = str.length();
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        char ch3 = str.charAt(2);
        char ch4 = str.charAt(3);
        char ch5 = str.charAt(4);
        char ch6 = str.charAt(5);

        System.out.println("num = " + num);
        System.out.println("ch1 = " + ch1);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }
}
