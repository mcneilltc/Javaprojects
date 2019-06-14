import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Puzzle {
    //Vowels vowels = new Vowels(puzzle);
    private String category = "Something";
    private String solvedPuzzle = "";
    private String puzzleProgress ="";
private ArrayList<String> puzzles;

    public void puzzleToArray(ArrayList<String>arrList)throws  IOException{
Path path = Paths.get("Puzzles.txt");
arrList.clear();
try (Stream<String> lines = Files.lines(path)){
    Object[] arr = lines.toArray();
    for(Object t: arr){
        arrList.add(t.toString());
    }
    System.out.println("#of puzzles:" + this.puzzles.size());
}
RandomPuzzle();
    }

    public static String padLeft(String s, int n){
        return String.format("%" +n + "s", s);
    }
    public void RandomPuzzle(){
        Random rand = new Random();
        int puzzleIndex = rand.nextInt(this.puzzles.size());
    this.category = "Something";
    this.solvedPuzzle = this.puzzles.get(puzzleIndex).toUpperCase();
    this.puzzleProgress = padLeft("", this.solvedPuzzle.length());
    applyLetterProgress(' ');
    }
public boolean solvePuzzle(String guess){
        if(guess.toUpperCase().trim().equals(this.solvedPuzzle)){
            this.puzzleProgress = this.solvedPuzzle;
            return true;
        }
        return false;
}
    public String getCategory() {
        return this.category;
    }

    public String getSolvedPuzzle() {
        return this.solvedPuzzle;
    }

    public String getPuzzleProgress() {
        return this.puzzleProgress;
    }

    public boolean isSovled(){
        return this.solvedPuzzle.equals(this.puzzleProgress);
    }


    private void applyLetterProgress(Character letter ){
        int numChar = this.solvedPuzzle.length();
        char[] inProgress = this.puzzleProgress.toCharArray();
for(int i =0; i< numChar; i++){
    if(this.solvedPuzzle.charAt(i)== letter){
        inProgress[i] = letter;
    }else if (Character.isWhitespace(this.solvedPuzzle.charAt(i)) == true){
        inProgress[i] = ' ';
    }else{
        inProgress[i] = '_';
    }
}//for loop
        this.puzzleProgress = String.valueOf(inProgress);
    }
//    public Puzzle(String phrase){
//     ArrayList<String> puzzles= new ArrayList<>();
//     String[]arrpuzzles = puzzles.toArray(new String[0]);
//    }
// public static void checkpuzzle(){
//String secretPhrase = "";
//String guess = "";
//Scanner keyboard = new Scanner(System.in);
//while(guess == ""){
//    for (char otherlets : secretPhrase.toCharArray()){
//        if (guess.indexOf()) {
//            System.out.println('*');} else{
//            System.out.println(otherlets);
//        }
//        }}
//
//    System.out.println("Choose your letter:");
//     System.out.println(Vowels.letters(otherlets));
//    String letter = keyboard.next();
//
//switch (letter){
//    case "A":
//        if (Vowels.vowels.contains('A')){
//            System.out.println("The puzzle contains A");
//        }else{
//            System.out.println("Sorry no A's");}
//        break;
//    case "E":
//    if (Vowels.vowels.contains('E')){
//        System.out.println("The puzzle contains E");
//    }else{
//        System.out.println("Sorry no E's");
//    }
//        break;
//    case "I":
//    if (Vowels.vowels.contains('I')){
//        System.out.println("The puzzle contains I");
//    }else{
//        System.out.println("Sorry no I's");}
//        break;
//    case "O":
//    if (Vowels.vowels.contains('O')){
//        System.out.println("The puzzle contains O");
//    }else{
//        System.out.println("Sorry no O's");}
//        break;
//    case "U":
//    if (Vowels.vowels.contains('U')){
//        System.out.println("The puzzle contains U");
//    }else{
//        System.out.println("Sorry no U's");}
//        break;
//    default:
//        System.out.println("Not a valid input try again");
//        checkpuzzle();
//        break;
// }
//}
//    public static void solvepuzzle(){
//        System.out.println("What's your answer");
//        if(secretPhrase == guess){
//            System.out.println("you solved the puzzle!");
//        }
//    }
}
