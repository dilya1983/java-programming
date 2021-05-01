package day06_arithmetic_operarors;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Jeep Wrangler";
        String driveRName = "Batmen";
        String licenseNumber = "Btm123";
        int speed = 80;
        boolean isAutomatic = false;
        char licenseType = 'D';
       // System.out.println("Dodge charger is car model");
        System.out.println("Car Model: "+carModel);
        System.out.println(carModel+ " is car model.");
        System.out.println("Driver name: "+driveRName);
        System.out.println(driveRName + " is driving a car "+ carModel);
        System.out.println("Current speed is: "+speed);
        System.out.println("Current speed: " + speed + " mph ");
        System.out.println("is car automatic -> "+isAutomatic);
        System.out.println(licenseNumber + " " +isAutomatic );
        System.out.println(licenseNumber+" - "+isAutomatic);


    }
}
