
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Bookstore bookstore= new Bookstore("TheNook", "Somewhere USA", 2000, true,
                true, true, true, LocalTime.now(), LocalTime.now());

        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("Welcome to %s", bookstore.name));
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println(String.format("Hello %s", name ));
        bookstore.getClosingtime();
        bookstore.getName();
        bookstore.getOpen();
        bookstore.getOpeningtime();
        bookstore.getSaturday();
        bookstore.getSunday();
        bookstore.getSqft();
        bookstore.getUsedbooks();
        System.out.println("The books we have on hand are:"+bookstore.getTitles());

CoffeeShop coffeeShop = new CoffeeShop();
coffeeShop.getName("");
coffeeShop.getAddress("");
coffeeShop.getSqft("");
coffeeShop.getOpen(true);
coffeeShop.getOpeningtime(LocalTime.now());
coffeeShop.getSaturday(true);
coffeeShop.getSunday(true);
coffeeShop.getClosingtime(LocalTime.now());

CornerStore cornerStore = new CornerStore();
cornerStore.getName("");
cornerStore.getAddress("");
cornerStore.getOpen(true);
cornerStore.getSqft("");
cornerStore.getOpeningtime(LocalTime.now());
cornerStore.getClosingtime(LocalTime.now());
cornerStore.getSaturday(true);
cornerStore.getSunday(true);

SandwichShop sandwichShop = new SandwichShop();
sandwichShop.getName("");
sandwichShop.getAddress("");
sandwichShop.getOpen(true);
sandwichShop.getSqft("");
sandwichShop.getOpeningtime(LocalTime.now());
sandwichShop.getClosingtime(LocalTime.now());
sandwichShop.getSaturday(true);
sandwichShop.getSunday(true);

//System.out.println("The meats we have on hand are:"+ sandwichShop.getMeats());

    }// end public main
}//end Main
