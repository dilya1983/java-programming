package day05__primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args){
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);//100
        System.out.println(num2);//100

        num1 = 200;
        System.out.println(num1); //200
        System.out.println(num2);//100

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int inthirasZipCode = 22182;
        int parvinZipCode  = inthirasZipCode;
        System.out.println(inthirasZipCode);
        System.out.println(parvinZipCode);

        inthirasZipCode = 20007;
        parvinZipCode = 33131;
        System.out.println(inthirasZipCode);
        System.out.println(parvinZipCode);



    }
}
