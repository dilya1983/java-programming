package day35_methods_with_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {
        buildEmail("Dilya","Yahoo");
        buildEmail("John word III","yahoo");
    }
    public static void buildEmail(String name,String domain){
        name = name.replace(" ","_").toLowerCase(Locale.ROOT);
        domain = domain.toLowerCase(Locale.ROOT);
       String email = name+"@"+domain+".com";
        System.out.println(email);
    }
}
