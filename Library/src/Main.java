import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the best library in the world");
        System.out.println("What is your name");
        String name = scanner.next();
        System.out.println(String.format("Hello %s", name));
        System.out.println("What are you looking for today? A book (b), news (n), audio (a), or video (v)");

    }
}
