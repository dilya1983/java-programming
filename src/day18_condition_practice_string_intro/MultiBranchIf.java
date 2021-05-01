package day18_condition_practice_string_intro;

public class MultiBranchIf {
    public static void main(String[] args){
        int num = 5;
        if(num>0) {
            System.out.println("Positive " + num);
        }else if(num<0) {
            System.out.println("Negative");
        }else {
            System.out.println("Number is zero");
        }
    }
}
