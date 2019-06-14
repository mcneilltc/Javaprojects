import java.util.Random;



public class Spin {
    //
    public static int spinWheel() {
        int spinw = 0;
        Random spin = new Random();
        spinw = spin.nextInt(4) + 1;
        System.out.println(spinw);
        do {
            switch (spinw) {
                case 0:
                    System.out.println("Bankrupt");
                    Players.score = 0;
                    break;
                case 1:
                    //add if
                    Players.score = Players.score + 100;
                    break;
                case 2:
                    //add if
                    System.out.println("Works");
                    Players.score = Players.score + 500;
                    break;
                case 3:
                    Players.score = Players.score + 1000;
                    break;
                default:
                    Players.score = Players.score + 0;
                    System.out.println("You lose a turn");
                    break;

            }
        } while (spinw != 0);

        return  spinw;
    } // end spinwheel method
}// end class Spin
//


