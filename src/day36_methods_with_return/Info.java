package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        fullName();//"mike Smith
                                            //Mike smith
        System.out.println("fullName  = " + fullName());
        System.out.println("isMarried = " + isMarried());
        System.out.println("getAge = " + getAge());
        System.out.println("Birth year = " + getRandomYear());
        
        String  name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

        if(isMarried()){
            System.out.println("married");///?????????????
            return;
        }
    }
    public static String fullName(){
        return "Mike Smith";


    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        int age = 35;
        return 35;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);//dynamic.different each time
        return randomYear;
    }

}

