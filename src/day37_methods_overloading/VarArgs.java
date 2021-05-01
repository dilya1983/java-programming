package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100,200,300);
        addNumbers(23,45,54,67,87,67,556,980,786,78,65,44,32,67,23);
        addNumbers();
    }
    public static void addNumbers(int... nums){
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
