import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;

public class SandwichShop implements Store{

//    private ArrayList<String> meats;
//
//    private void loadMeats() {
//        try {
//            Utils.loadStringsToArray1(this.meats);
//        } catch (IOException e) {
//            System.out.println("Could not initialize the titles");
//            this.meats = new ArrayList<String>();
//        }
//    }
    @Override
    public Boolean getOpen(Boolean open) {
        LocalTime max = LocalTime.MAX.minusHours(4);
        LocalTime min = LocalTime.NOON.minusHours(2);
        if(max.isBefore(LocalTime.of(20,0)) || min.isAfter(LocalTime.of(8, 0))){
            System.out.println("Yes we're OPEN come on in");
        }
        else{
            System.out.println("Sorry, we're CLOSED :( Come see us tomorrow");
        }
        return open;
    }

    @Override
    public String getName(String name) {
        System.out.println("Welcome to the Slammich Shop!");
        return name;
    }

    @Override
    public Boolean getSaturday(Boolean saturday) {
        DayOfWeek sat = DayOfWeek.SATURDAY;
        System.out.println(String.format("We are open on Saturday from %s to %s", LocalTime.NOON.minusHours(3), LocalTime.NOON.plusHours(4) ));
        return saturday;
    }

    @Override
    public LocalTime getOpeningtime(LocalTime openingtime) {
        LocalTime d1 = LocalTime.now();
        LocalTime d2 = LocalTime.parse("08:00:00");
        if (d1.isAfter(d2)) {
            System.out.println("We are open");
        } else {
            System.out.println("We open at 8:00am");
        }

        return openingtime;
    }

    @Override
    public Boolean getSunday(Boolean sunday) {
        System.out.println("We are getting ready for Monday");
        return sunday;
    }

    @Override
    public String getAddress(String address) {
        System.out.println("The address is 1234 Hamburger Row Drive");
        return address;
    }

    @Override
    public LocalTime getClosingtime(LocalTime closingtime) {
        LocalTime d1 = LocalTime.now();
        LocalTime d2 = LocalTime.parse("20:00:00");
        if(d1.isAfter(d2)){
            System.out.println("Sorry We are closed. We open at 8:00am");
        }
        return closingtime;
    }

    @Override
    public String getSqft(String sqft) {
        System.out.println("The Slammich shop is 10000 square feet. We leave room for freshness.");
        return sqft;
    }

//    public ArrayList<String> getMeats() {
//        return meats;
//    }
}
