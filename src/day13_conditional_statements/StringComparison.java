package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "los Angeles";
        if(city.equals("Los Angeles")) {
        }else {
            System.out.println("It is NOT LA");
            String weather = "sunny";
            if(weather.equals("sunny")) {
            }else {
                System.out.println("Lets stay indoors, and code java");
            }
        }
    }


}
