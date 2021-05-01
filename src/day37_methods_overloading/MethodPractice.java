package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("hi",3, '|'));
        System.out.println(repeatString("I can do it !",10, '-'));
    }
    public static String repeatString(String word,int times,char delimiter){
        String result = "";
        for(int i = 0; i <times;i++){

            result += word+ delimiter;


        }
        return result.substring(0,result.length()-1);

    }
}
