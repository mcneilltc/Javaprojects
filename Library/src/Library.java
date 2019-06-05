import java.time.LocalTime;

public interface Library {

String getTitle(String title);
String getAuthor(String author);
String getLocation(String location);
LocalTime getCheckindate (LocalTime checkindate);
LocalTime getCheckoutdate (LocalTime checkoutdate);
Boolean getCheckin (Boolean checkin);
Boolean getCheckout(Boolean checkout);
}
