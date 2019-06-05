import java.time.LocalTime;


public interface Store{
//    String name, address;
//    Integer sqft;
//    Boolean open, saturday, sunday;
//    LocalTime openingtime, closingtime;
//
//    public Store (){
//
//    }

    String getName(String name);
    String getAddress(String address);
    String getSqft(String sqft);
    Boolean getOpen(Boolean open);
    Boolean getSaturday(Boolean saturday);
    Boolean getSunday(Boolean sunday);
    LocalTime getOpeningtime(LocalTime openingtime);
    LocalTime getClosingtime(LocalTime closingtime);

    }
