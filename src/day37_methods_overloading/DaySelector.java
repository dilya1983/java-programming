package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {

        System.out.println(getDayName(1));
        System.out.println(getDayName(2));
        System.out.println(getDayName(10));


        for (int i = 1; i < 9; i++) {
            System.out.println(i + " = " + getDayName(i));
        }

        String today = getDayName(6);
        System.out.println("today = " + today);
        String someDay = getDayName(0);
        if (someDay == null) {
            System.out.println("someDay  is null  for invalid day ");
        }

    }

    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = " Error: Invalid day - " + day;
                break;
        }

        return dayName;
    }

}



