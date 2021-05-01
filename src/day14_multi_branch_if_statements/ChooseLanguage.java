package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language");
        int selection = 1;
        if (selection == 1) ;
        System.out.println("hello,thank you for your call");
        if (selection == 2) {
            System.out.println("hola,gracias para llamar");
        } else if (selection == 3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (selection == 4) {
            System.out.println("privet, spasiba za vash zvonok");
        }else if(selection == 5) {
            System.out.println("merci,pour votre appel");
        }else {
            System.out.println("Lets talk java and english,hello");


        }

}
}