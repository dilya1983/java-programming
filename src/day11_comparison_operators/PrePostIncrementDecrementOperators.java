package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //PRE-INCREMENT ++ (increase by1)
        int num1 = 10;
        //++num1;
        int num2 = ++num1;//11
        System.out.println("num1 = " + num1);//10
        System.out.println("num2 = " + num2);//10

        // POST-INCREMENT-> add 1 afterwards
        int num3 = 8;
        //int num4 = num3;
        //num3++;
        int num4 = num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int apples = 5;
        int basket = ++apples;

        System.out.println("basket = " + apples);
        System.out.println("basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars);

        int sedans = 10;
        System.out.println(sedans++);//10
        System.out.println(sedans);//11
        
        
        int a = 50;
        int b = 22;
        int c = a++ + ++b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    
}
