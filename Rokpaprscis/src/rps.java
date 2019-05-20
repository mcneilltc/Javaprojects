import java.util.Random;
//import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        String computerOne = "";
        String computerTwo = "";
        int computerInt;
        int computerTwoInt;
        //Scanner one = new Scanner(System.in);
        Random pick = new Random();


        System.out.println("Let's play RPS");
        System.out.println();

        computerInt = pick.nextInt(3) + 1;
        computerTwoInt = pick.nextInt(3) + 1;

        if (computerInt == 1) {
            computerOne = "R";

        } else if (computerInt == 2) {
            computerOne = "P";
        } else if (computerInt == 3) {
            computerOne = "S";
        }
            if (computerTwoInt == 1) {
                computerTwo = "R";

            } else if (computerTwoInt == 2) {
                computerTwo = "P";
            } else if (computerTwoInt == 3) {
                computerTwo = "S";
            }
            System.out.println("Computer one plays:" + computerOne);
            System.out.println("Computer two plays:" + computerTwo);

            if (computerOne.equals(computerTwo)) {
                System.out.println("It's a tie");
            } else if (computerOne.equals("R")) {
                if (computerTwo.equals("S"))
                    System.out.println("Rock smash scissors computerOne wins!");
                else if (computerTwo.equals("P"))
                    System.out.println("Paper beats Rock computerTwo wins!");
            } else if (computerOne.equals("P")) {
                if (computerTwo.equals("S"))
                    System.out.println("Scissors cut paper computerTwo wins!");
                else if (computerTwo.equals("R"))
                    System.out.println("Paper covers rock computerOne wins!");
            } else if (computerOne.equals("S")) {
                if (computerTwo.equals("P"))
                    System.out.println("Scissors cut paper computerOne wins!");
                else if (computerTwo.equals("R"))
                    System.out.println("Rock breaks scissors computerTwo wins!");
            } else System.out.println(("Invalid computer input"));

        }
}
