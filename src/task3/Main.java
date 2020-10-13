package task3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        /*TouristPlace tajMahal = new TouristPlace("Taj Mahal", "9AM to 7PM", "Agra", 100, "Romantic");
        tajMahal.addFamousFor("Photography");
        tajMahal.addFamousFor("Love Point");
        tajMahal.addFamousFor("Modern Marvel");

        tajMahal.rate(4);
        tajMahal.rate(5);
        tajMahal.rate(3);

        System.out.println(tajMahal.starRating);
        System.out.println(tajMahal.famousFor);*/

        /*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));*/

        Calendar calendar = Calendar.getInstance();
        System.out.println("The current date is : " + calendar.getTime());
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 days ago: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 months later: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 years later: " + calendar.getTime());
    }
}
