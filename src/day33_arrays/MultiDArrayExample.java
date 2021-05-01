package day33_arrays;
import java.util.*;
public class MultiDArrayExample {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0] = "dilorom khamidova";
        users[0][1] = "diloromsPWD12";
        users[1][0]  = "Anna Ziyaeva";
        users[1][1]  = "AnnaAlmaty113";
         users[2][0] = "Parvin Altate";
         users[2][1]  = "Parvinvienna321";

         String[][] userData = { {"dilorom khamidova", "diloromsPWD12" },
                              {"Anna Ziyaeva", "AnnaAlmaty113"},
                              { "Parvin Altate", "Parvinvienna321"}};

        System.out.println(userData[0][0]);
        System.out.println(userData);


        System.out.println(Arrays.deepToString(userData));
    }
}
