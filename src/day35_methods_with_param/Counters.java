package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(8);
        int num = 999;
        count(num);
        printAge(1983);
        printAge(2017);
        printAge(1981);

        int birthYear = 2001;
        printAge(birthYear);

        String word = "wooden spoon";
        count(word.length());
    }
    public static void count(int num){
        for(int i = 0; i <= num; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void printAge(int year){
        int age = 2021 - year;//calculate
        System.out.println("Birth year: " + year +". Age: " + age);
    }
}
