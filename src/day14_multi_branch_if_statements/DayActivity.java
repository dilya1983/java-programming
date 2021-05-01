package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "sunny";
        if(weather.equals("sunny")) {
            System.out.println(weather + " - Go to park");
        }else {
            if(weather.equals("rainy")) {
                System.out.println(weather + " - Stay home");
            }else {
                if(weather.equals("Snowy")) {
                    System.out.println(weather + " - Stay home its winter");
                }else {
                    if(weather.equals("windy")) {
                        System.out.println(weather + " - Stay home its windy");
                    }else {
                        System.out.println("Love java");
                    }
                }
            }
        }

    }
}
