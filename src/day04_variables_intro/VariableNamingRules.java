package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
        int cup = 30;
        System.out.println(cup);
        int static2 = 22;
        int _static = 22;
        int $tatic = 44;
        int staticVar = 234;

        int salary$ = 55;
        int  $ = 10;
        int  _ = 3;
        System.out.println($);
        System.out.println(_);
        //About variable work fine,but not recommended.
        //we should use meaningful variable names
        //int number-of-friends = 400;-> ERROR
        int numberOfFriend = 401;
        int number_of_friends = 401;

    }

}
