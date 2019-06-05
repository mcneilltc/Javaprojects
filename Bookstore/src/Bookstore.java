import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;


public class Bookstore {
    String name, address;
    Integer sqft;
    Boolean usedbooks, open, saturday, sunday;
    LocalTime openingtime, closingtime;
    ArrayList <String> titles;

    public Bookstore(String name, String address, Integer sqft, Boolean usedbooks,
                     Boolean open, Boolean saturday, Boolean sunday,
                     LocalTime openingtime, LocalTime closingtime) {
//    public Bookstore(String name){
        this.name = name;
        this.address = address;
        this.sqft = sqft;
        this.usedbooks = usedbooks;
        this.open = open;
        this.saturday = saturday;
        this.sunday = sunday;
        this.openingtime = openingtime;
        this.closingtime = closingtime;
        this.titles = new ArrayList<String>();
        loadTitles();
    }

    private void loadTitles(){
        try{
            Utils.loadStringsToArray(this.titles);
        }
        catch (IOException e){
            System.out.println("Could not initialize the titles");
            this.titles = new ArrayList<String>();
        }
    }


    public String getName() {
        System.out.println("Welcome to the Magical Bookstore");
        return name;
    }

    public String getAddress() {
        System.out.println("The address is 200 Dragon Alley, London Bridge, 09210");
        return address;
    }

    public Integer getSqft() {
        System.out.println("The store has over 15,000 square feet of books");
        return sqft;
    }

    public Boolean getUsedbooks() {
        if(usedbooks){
            System.out.println("We have greatly loved books too!");
        }
        return usedbooks;
    }

    public Boolean getOpen() {
        LocalTime max = LocalTime.MAX.minusHours(4);
        LocalTime min = LocalTime.NOON.minusHours(2);
        if(max.isBefore(LocalTime.of(22,0)) || min.isAfter(LocalTime.of(8, 0))){
            System.out.println("Yes we're OPEN come on in");
        }
        else{
            System.out.println("Sorry, we're CLOSED :( Come see us tomorrow");
        }
        return open;
    }

    public Boolean getSaturday() {
        DayOfWeek sat = DayOfWeek.SATURDAY;
        System.out.println(String.format("We are open on Saturday from %s to %s", LocalTime.NOON.minusHours(3), LocalTime.NOON.plusHours(4) ));
        return saturday;
    }

    public Boolean getSunday() {
        DayOfWeek sun = DayOfWeek.SUNDAY;
        System.out.println(String.format("We are open on Sunday from %s to %s", LocalTime.NOON.plusHours(1), LocalTime.NOON.plusHours(5) ));
        return sunday;
    }

    public LocalTime getOpeningtime() {
        LocalTime d1= LocalTime.now();
        LocalTime d2= LocalTime.parse("08:00:00");
        if(d1.isAfter(d2)){
            System.out.println("We are open");
        } else{
            System.out.println("We open at 8:00am");
        }

        return openingtime;
    }

    public LocalTime getClosingtime() {
        LocalTime d1 = LocalTime.now();
        LocalTime d2 = LocalTime.parse("20:00:00");
        if(d1.isAfter(d2)){
            System.out.println("Sorry We are closed. We open at 8:00am");
        }
//        Date d1 = new Date();
//        System.out.printf("The local time is: %tc", d1);
        return closingtime;
    }


    public ArrayList<String> getTitles() {
        return titles;
    }
}//end Bookstore
