import java.time.LocalTime;

public class LibraryItem implements Library{
//    String title, author, location;
//    LocalTime checkindate, checkoutdate;
//    Boolean checkin, checkout;




//    public LibraryItem(String title, String author,
//                       String location, LocalTime checkindate, LocalTime checkoutdate,
//                       Boolean checkin, Boolean checkout) {
//        this.title = title;
//        this.author = author;
//        this.location = location;
//        this.checkindate = checkindate;
//        this.checkoutdate = checkoutdate;
//        this.checkin = checkin;
//        this.checkout = checkout;
//    }
@Override
    public String getTitle(String title) {
        System.out.println("Book Title Test");
        return title;
    }
@Override
    public String getAuthor(String author) {
    System.out.println(String.format("Author of %s is ",getTitle("title")));
        return author;
    }
@Override
    public String getLocation(String location) {
        System.out.println("The item is located on some floor in the library");
        return location;
    }
@Override
    public LocalTime getCheckindate(LocalTime checkindate) {
        LocalTime checkin = LocalTime.MIDNIGHT.plusHours(8);
        System.out.println(String.format("The item titled %s  by %s was checked in at %s", getTitle("title"),
                getAuthor("author"), checkindate ));
        return checkindate;
    }
@Override
    public LocalTime getCheckoutdate(LocalTime checkoutdate) {
        LocalTime checkout = LocalTime.MAX.minusHours(6);
        System.out.println(String.format("The item titled %s by %s was checked out on %s", getTitle("title"),
                getAuthor("author"), checkoutdate));
        return checkoutdate;
    }
    @Override
    public Boolean getCheckin(Boolean checkin) {
        Boolean location1 = true;
        Boolean location2 = false;
        if(location1){
            System.out.println("The book is in the library");
        }else if(location2){
            System.out.println(String.format("Someone was checked out the item %s by %s on %s",
                    getTitle("title"), getAuthor("author"), checkoutdate));
        }
        return checkin;
    }
@Override
    public Boolean getCheckout(Boolean checkout) {
        System.out.println(String.format("The item titled %s by %s was checked out on %s",
                getTitle("title"), getAuthor("author"), checkoutdate));
        return checkout;
    }



//    public static class Title{
//
//    }//  class title of the book
//    public static class Author{
//
//    }// class Author
//    public static class Pubdate{
//
//    }// class publish date
//    public static class Checkout{
//
//    }// class checkout date
//    public static class Checkin{
//
//    }// class checkin date
//    public static class Location{
//
//    }// book location


}
