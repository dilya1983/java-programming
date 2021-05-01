package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5.5,50.0));
        double sum= add(1,3);
        System.out.println("sum = " +sum);
        System.out.println("100.0 + 200.0 = " +add(100,200));

        System.out.println(minus(5,2));
        System.out.println(divide(5,2));

    }
    public static double add(double num1,double num2){
        return  num1+num2;
    }
    public static double minus(double num1,double num2){
        return num1-num2;
    }
    public static double divide(double num1,double num2){
        return  num1/num2;
    }
    public static double multiply(double num1,double num2) {
        return num1 * num2;
    }
}
