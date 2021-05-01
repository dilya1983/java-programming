package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {

        boolean isHungry = true;
        int banana = 0;
        int countToFill =3;

        while (isHungry) {
            banana++;
           System.out.println("Enter a banana: "  + banana);
           if (banana == countToFill) {
                isHungry = false;
            }
        }
        System.out.println("Had enough bananas, Lets  get back to studying");

        }
    }

