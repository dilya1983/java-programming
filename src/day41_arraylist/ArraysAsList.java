package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = "+nums);
        //nums.clear();

        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
             numsList.add(33);
             numsList.add(56);
        System.out.println("numsList =" +numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList =" +numsList);


        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee","tea", "monster",
                "red bull","coke", "pepsi","mdew","kambucha","celsius" ));

        System.out.println(drinksWithCaffeine);

        int caffeineAmount = 0;
        for(String drink : drinksWithCaffeine){
            if(drink.equals("monster")|| drink.equals("celsius")){
                caffeineAmount = 150;
                System.out.println(drink + " --> " +caffeineAmount);

            }else if (drink.equals("coffee")|| drink.equals("kambucha")){
                caffeineAmount = 122;
                System.out.println(drink+ " -> " +caffeineAmount);
            }else if (drink.equals("tea")|| drink.equals("coke") || drink.equals("pepsi")|| drink.equals("mdew")){
                caffeineAmount = 35;
                System.out.println(drink + " -> " +caffeineAmount);

            }
        }
        for(String drink : drinksWithCaffeine){
            switch (drink){
                case "monster" : case "red bull" : case "celsius":
                    caffeineAmount =150;
                    System.out.println(drink + " -> " + caffeineAmount);
                    break;
                case "coffee" : case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
             }
            }
        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));

        drinksWithCaffeine.forEach(each ->{
            System.out.println("=======");
            System.out.println("each = " +each);
            System.out.println("=========");
        });



        }

}