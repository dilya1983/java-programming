package day35_methods_with_param;

public class MethodWithParams {
    public static void main(String[] args) {
       displayValue(50);
       displayValue(150);
       int count = 55;
       displayValue(count); // num = count
        greerByName("Mahmud");
        greerByName("Shafoat");
        String name = "Sarah";
        greerByName(name);
    }
    public static void displayValue(int num){
        System.out.println("value is " + num);
    }

    public static void greerByName(String name){
        System.out.println("Hello "+name+",How are you today?");
    }
}
