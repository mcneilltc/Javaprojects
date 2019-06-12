import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Puzzle {
private ArrayList<String> puzzles;
    public static void puzzleToArray(ArrayList<String>arrList)throws  IOException{
Path path = Paths.get("Puzzles.txt");
arrList.clear();
try (Stream<String> lines = Files.lines(path)){
    Object[] arr = lines.toArray();
    for(Object t: arr){
        arrList.add(t.toString());
    }
}
    }
    public Puzzle(String phrase){
     ArrayList<String> puzzles= new ArrayList<>();
     String[]arrpuzzles = puzzles.toArray(new String[0]);


    }
 public static void checkpuzzle(){
String secretPhrase = "";
String guess = "";
Scanner keyboard = new Scanner(System.in);
while(guess == ""){
    for (char otherlets : secretPhrase.toCharArray()){
        if (guess.indexOf()) {
            System.out.println('*');} else{
            System.out.println(otherlets);
        }
        }}

    System.out.println("Choose your letter:");
    String letter = keyboard.next();

switch (letter){
    case "A":
        if (Vowels.vowels.contains('A')){
            System.out.println("The puzzle contains A");
        }else{
            System.out.println("Sorry no A's");}
        break;
    case "E":
    if (Vowels.vowels.contains('E')){
        System.out.println("The puzzle contains E");
    }else{
        System.out.println("Sorry no E's");
    }
        break;
    case "I":
    if (Vowels.vowels.contains('I')){
        System.out.println("The puzzle contains I");
    }else{
        System.out.println("Sorry no I's");}
        break;
    case "O":
    if (Vowels.vowels.contains('O')){
        System.out.println("The puzzle contains O");
    }else{
        System.out.println("Sorry no O's");}
        break;
    case "U":
    if (Vowels.vowels.contains('U')){
        System.out.println("The puzzle contains U");
    }else{
        System.out.println("Sorry no U's");}
        break;
    default:
        System.out.println("Not a valid input try again");
        checkpuzzle();
        break;
 }
public static void solvepuzzle(){
    System.out.println("What's your answer");
    if(secretPhrase == guess){
        System.out.println("you solved the puzzle!");
    }
}
}
}
