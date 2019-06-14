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
    public Puzzle(){
Path path =Paths.get("Puzzles.txt");
try{
    System.out.println(" "+ path.toAbsolutePath().toString());
this.puzzles =(ArrayList<String>)Files.readAllLines(path);
    System.out.println(" "+ this.puzzles.size());
}catch (IOException e) {
    e.printStackTrace();
}RandomPuzzle();
    }
    //Vowels vowels = new  Vowels(puzzle);
    private String category = "Something";
    public String solvedPuzzle = "";
    private String puzzleProgress ="";
private ArrayList<String> puzzles;

    public void puzzleToArray(ArrayList<String>arrList)throws IOException{
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


    public boolean solvedPuzzle(String guess){
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

}
