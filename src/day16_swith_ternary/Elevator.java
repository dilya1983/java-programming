package day16_swith_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 1;
        if(floorNum == 1) {
            System.out.println("Floor 1 selected.Companies:Lobby,Verizon,Starbucks");
        }else if (floorNum == 2) {
            System.out.println("Floor 1 selected.Companies: Cybertek,NASA,Intelsat");
        }else if(floorNum == 3) {
            System.out.println("Floor 1 selected.Companies: Lyft,BoFA,Stake house");
        }else {
            System.out.println("Invalid floor - " + floorNum);


            System.out.println("========Switch statement version=======");

            floorNum = 4;

            switch(floorNum) {
                case 1:
                    System.out.println("Floor 1 selected.Companies:Lobby,Verizon,Starbucks");
                    break;//next switch
                case 2:
                    System.out.println("Floor 1 selected.Companies: Cybertek,NASA,Intelsat");
                    break;//next to switch statement
                case 3:
                    System.out.println("Floor 1 selected.Companies: Lyft,BoFA,Stake house");
                    break;
                default:
                    System.out.println("Invalid floor - " +floorNum);
                    break;
            }

        }
    }
}
