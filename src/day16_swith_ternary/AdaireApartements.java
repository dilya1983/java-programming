package day16_swith_ternary;

public class AdaireApartements {
    public static void main(String[] args) {
        System.out.println("#### WELCOME TO ADAIRE APARTMENT ####");
        int numberOfBedroom = 1;
        double startingPrice = 0;
        switch (numberOfBedroom) {

            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("One bedroom selected");
                startingPrice = 1725.0;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println(numberOfBedroom + " bedroom currently unavailable");
                break;//exit Main method
            }

        System.out.println("Starting price: $ " + startingPrice);


        }

    }

