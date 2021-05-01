package day06_arithmetic_operarors;

public class CalculateAge {
    public static void main(String[] args){
        int yearOfBirth = 2015;
        int currentYears = 2021;
        int age = currentYears - yearOfBirth;
        System.out.println("You are " + age + " years old ");
        System.out.println("I born in "  + currentYears);
        System.out.println("We are born in " + yearOfBirth + " and also in " + currentYears);
    }
}
