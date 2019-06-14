import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Players {

     static ArrayList<String> players = new ArrayList<>();
     public static int score = 0;
     Spin spin = new Spin();
    public static  void players() {
//        String player = new player("");
//        System.out.println("Enter your name: ");
        Scanner name = new Scanner(System.in);
        char answer;


        do{
            System.out.println("Enter your name:");
            String player = name.next();
            players.add(player);
            System.out.println("Would you like to add another player? Y/N");
            answer = name.next().toLowerCase().charAt(0);
            while(answer != 'y' && answer !='n'){
                System.out.println("You have an invalid response");
                System.out.println("Would you like to add another player? Y/N");
                answer = name.next().toLowerCase().charAt(0);
            }
        }
        while(answer == 'y');
        System.out.println("Ok lets play Wheel of Fortune");
//numPlayers = players.size();
        System.out.println(players);
    }//end psvoid players

    public static void setPlayers(ArrayList<String> players) {
        Players.players = players;
    }

    public static ArrayList<String> getPlayers() {
        return players;
    }
//do{
//        Puzzle puzzle = new Puzzle();
//        do{
//            for(int i = 0; i <numplayers; i++){
//                Player currentPlayer = players.get(i);
//                boolean playerTurnOver =false;
//                do{
//
//                }while(playerTurnOver ==false);
//            }
//        }while(exitGame ==false  && puzzle.isSovled() ==false);
//    }while(exitGame ==false);


    public static void choices(){
    Scanner choice = new Scanner(System.in);
    System.out.println(" Make a choice: 1 - Solve Puzzle, 2 - Spin Wheel,  3 - Buy a Vowel, 0 - Quit Game");
    //char answer = choice.next().toLowerCase().charAt(0);
    int pick = choice.nextInt();

    switch(pick) {
        case 0 :
        //quit game
            System.out.println("Thanks for playing");
         break;
        case 1:
        //Puzzle.solvePuzzle();//solve puzzle
            System.out.println("Would you like to solve the puzzle? Y/N");
//
        break;
        case 2:
            Spin.spinWheel();//spinwheel
            System.out.println("Spinning the wheel...");
            System.out.println("Enter a letter: ");//get consonant
//score =
        break;
        case 3:
            //Vowels.buyvowel();  //buy vowel
            System.out.println("Would you like to buy a vowel? Y/N");

//
        break;
        default: // error
            System.out.println("You have entered an invalid response");
            choices();
    }//end switch pick


}//end psv choices

    public int getScore(){// return the players current score
        return score;
    }
    public static int addToScore(int score){// add a specified amount to the players score
        score += score;
        return score;
    }
}// end class Players
