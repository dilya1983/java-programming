package day38_methods;

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
      String name =   StringUtils.reverse("Dilorom");
        System.out.println(name);
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: Username cannot be util or empty");

        }

        System.out.println("civic = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = " +isPalindrome("Cybertek"));

    }
}
