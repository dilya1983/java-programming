package day40_arraylist;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty? = " + shoppingList.isEmpty());


        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, keep code java then goto mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("mask");
        shoppingList.add("cheap monitor");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, keep code java then goto mall");
        }

        int count = shoppingList.size();
        System.out.println("Item to buy = " + count);

        System.out.println("is shoes in my  list? " + shoppingList.contains("shoes"));
        if (shoppingList.contains("shoes")) {
            System.out.println("shoes is in the list");

        } else {
            System.out.println("Shoes is not in the list");

            System.out.println("Buying shoes in the  list");
        }
        System.out.println("Buying shoes ....$80");

        shoppingList.remove("shoes");

        System.out.println("list = " + shoppingList);

        System.out.println("Done shopping, get back to coding");
        shoppingList.clear();//clear the list, remove all items
        System.out.println(shoppingList);
    }



}
