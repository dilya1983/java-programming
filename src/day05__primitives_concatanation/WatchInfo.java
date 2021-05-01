package day05__primitives_concatanation;

public class WatchInfo {
    public static void main(String[] args){
        String brand = "Movado";
        String color = " Gold";
        double price = 849.99;
        boolean waterResistant = true;
        boolean isSmart = true;
        char gender = 'U';

        System.out.println("Brand:\t\t" + brand);
        System.out.println("Color:\t\t" + color);
        System.out.println("Price:\t\t" + price);
        System.out.println("WaterResistant:\t" + waterResistant );
        System.out.println("IsSmart:\t\t\t\t" + isSmart);
        System.out.println("Gender:\t\t\t\t\t" + gender);


        System.out.println("Brand:"+ brand+"\nColor:\t"+color+"\nPrice:\t"+price+"\nWaterResistant:\t"+waterResistant+"\nIsSmart:\t"+isSmart+"\nGender:\t"+gender);
    }
}
