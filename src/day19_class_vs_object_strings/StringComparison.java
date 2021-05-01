package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "New york";
        System.out.println(city.equals("New york"));
        System.out.println(city.equals("new york"));
        System.out.println(city.equals("New york "));

        //EQUALSIGNORECASE(NET
        System.out.println(city.equalsIgnoreCase("New york"));
        System.out.println(city.equalsIgnoreCase("NEW YORK"));
        System.out.println(city.equalsIgnoreCase("NewYoRk"));
        System.out.println(city.equalsIgnoreCase("NewwYork"));
        System.out.println(city.equalsIgnoreCase("New  york"));
        System.out.println(city.equalsIgnoreCase("Boston"));

        if(city.equals("New york")) {
            System.out.println("equals() true ");
        }else {
            System.out.println("equals() false");
        }
        if(city.equalsIgnoreCase("New york")){
            System.out.println("equalsIgnoreCase() true");
        }else {
            System.out.println("equalsIgnoreCase() false");
        }
    }
}
