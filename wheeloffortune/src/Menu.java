import java.util.ArrayList;

public class Menu {

    public static void main(String[] args) {
        ArrayList<Players> players = new ArrayList<Players>();
       // Players currentPlayer = players.get(1);
      // System.out.println("Current player is:" + currentPlayer.getName());
        Players.players();
        Players.choices();
        
        Puzzle puzzle = new Puzzle();
        puzzle.RandomPuzzle();
        System.out.println(puzzle.getPuzzleProgress());

Players.players();
Players.choices();
//Puzzle.RandomPuzzle();
Spin.spinWheel();
//Vowels.letters();


    }
}
