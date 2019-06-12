import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Players {
    static ArrayList<String> players = new ArrayList<>();
    public static void players() {
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

        System.out.println(players);
    }//end psvoid players

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
             //Spin.spinWheel();//spinwheel
            System.out.println("Would you like to spin the wheel? Y/N");
//
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
}// end class Players
