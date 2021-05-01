package day07_arithmatic_operators_casting;
/*
 System.out.println("java"+ 5+3);Output:Java53
 */

public class StringConcatPractice {
    public static void main(String[] args){
        System.out.println("java" + 5 + 3);//java53
        System.out.println("java" + (5 + 3));//java8

        System.out.println(5 + 3 + "java"); //8java
        System.out.println(5 + (3 + "java"));//53java

        System.out.println("heloo" + 1+2+3);//hello123
        System.out.println("hello" + (1+2+3));//hello6

        String str1 = "hello";
        String str2 = "friend";
        System.out.println(str1+str2);
        System.out.println(str1+""+str2);

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2);//15
        //7 8
        System.out.println(num1+ " "+num2 );//7 8
        System.out.println(num1+""+num2);//78
        System.out.println(5 +" " + 5 );//5 5

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1 + char2);//195
           //97+98=195
        System.out.println(char1 + "" +char2);//ab

        int row1 = 83;
        byte row2 = 96;

        System.out.println(row1+row2);//179
        System.out.println(row1 / row2);//0
        System.out.println(row1 + " " +row2);//83 96
        System.out.println(row1+""+row2);//8396


        char kin12 = 'D';
        char kin6  = 'u';

        System.out.println(kin12 + kin6);//
        System.out.println(kin12 + "" +kin6);

        byte kat2 = 100;
        int kat1  = 150;

        System.out.println(kat2+kat1);//250
        System.out.println(kat2 / kat1);//1








    }
}
