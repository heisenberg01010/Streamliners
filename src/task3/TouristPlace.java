package task3;

import java.util.ArrayList;
import java.util.List;

public class TouristPlace {
    String name;
    String workingHour;
    String city;
    int entryTicketPrice;
    String category;
    float starRating;
    int noOfRatings;
    List<String> famousFor = new ArrayList<>();

    public TouristPlace(String name, String workingHour, String city, int entryTicketPrice, String category) {
        this.name = name;
        this.workingHour = workingHour;
        this.city = city;
        this.entryTicketPrice = entryTicketPrice;
        this.category = category;
    }
    TouristPlace addFamousFor(String s){
            famousFor.add(s);
            return this;
    }
    void rate(int rating){
        //Calculate total stars
        float totalStars = noOfRatings * starRating;
        //add new star rating
        totalStars += rating;
        //increment total rating
        noOfRatings++;
        //Finally avg rating changed
        starRating = totalStars / noOfRatings;
    }
    public boolean isPlaceOpen() {
        workingHour = workingHour.replace("AM to ", ":")
                .replace("PM to ", ":")
                .replace("AM", "")
                .replace("PM", "");

        String time[] = workingHour.split(":");

        int startHr = Integer.parseInt(time[0]),
                startMin = Integer.parseInt(time[1]),
                endHr = Integer.parseInt(time[2]),
                endMin = Integer.parseInt(time[3]);

        return true;
    }
}
