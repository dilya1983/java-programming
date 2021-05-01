package day07_arithmatic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args){
        System.out.println(10 + 5);
        System.out.println(10 + 5 - 3);//12
        System.out.println(10 - 5 + 3);//8
        System.out.println(10- (5 + 3));//2

        System.out.println(2 * 3);//6
        System.out.println(2 * 3 / 3);
        System.out.println(20 / (2 * 2));//20 / 4 -> 5
       // System.out.println(10 / 0); -> cannot divide by ZERO. error while code running or Error/ Exception.

        System.out.println(2 + 5 * 3);//17
        System.out.println((2 + 5) * 3);//21

        System.out.println(10 / 3);//3
        System.out.println(5 / 2);//2

        //Use decimal points number double or float.
        System.out.println(10.0 / 3.0);//3.333
        System.out.println(5.0 / 2.0);//2.5


    }
}
