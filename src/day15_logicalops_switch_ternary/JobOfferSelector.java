package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Honolulu";
        double salary = 120_000.0;
        boolean isRemote = true;
        boolean hasBenefits = true;
        if (location.equals("Honolulu") && salary >= 120_000.0 && isRemote && hasBenefits) {
        System.out.println("Sure, I will accept this offer");
        }else{
            System.out.println("lets consider another offer or negotiate");
        }





    }
}
