import java.util.Random;



public class Spin {
//
    public void spinWheel() {
        int spinw = 0;
        Random spin = new Random();
spinw = spin.nextInt(4)+1;
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
}while (spinw != 0);
//         int bankrupt = -1;
//         int loseTurn = 0;
//        Random generator;
//        int position;
//
//          void Wheel(){
//            generator = new Random();
//            position = bankrupt;
        }
//
//public int getState(){
//            int score;
//            switch(position){
//                case 0:
//                    score = bankrupt;
//                    break;
//                case 1:
//                    score = 100;
//                    break;
//                case 2:
//                    score = 500;
//                    break;
//                case 3:
//                    score = 1000;
//                    break;
//                case 4:
//                    score = loseTurn;
//                default:
//                    System.out.println("Invalid Spin");
//
//                    break;
//            }return score;
//        }
//        public void spin(){
//            position = generator.nextInt(5);
//        }
//    }// end psv spinWheel


//       String player = "";
//        int onehun ;
//        int fivehun ;
//        int onek ;
//        int bankrupt ;
//        int loseturn;
//
//        Random spin = new Random();
//        System.out.println("Let's spin the wheel!");
//        System.out.println();
//        onehun = spin.nextInt(5)+1;
//        fivehun = spin.nextInt(5)+1;
//        onek = spin.nextInt(5)+1;
//        bankrupt = spin.nextInt(5)+1;
//        loseturn = spin.nextInt(5)+1;
//
//        if(onehun == 1 ){
//            System.out.println(String.format("%s gets 100 added to their score", player));
//            //player = "score plus 100";
//        }else if(fivehun == 2){
//            System.out.println(String.format("%s gets 500 added to their score", player));
//
//            //player = "score plus 500";
//        }else if( onek == 3){
//            System.out.println(String.format("%s gets 1000 added to their score", player));
//            //player = "score plus 1000";
//        }else if(bankrupt == 4){
//            System.out.println(String.format("%s is not bankrupt their score is zero", player));
//            //player = " score will be zero";
//        }else if( loseturn== 5){
//            System.out.println(String.format("%s will lose a turn", player));
//            //player = "score does not change but will lose a turn";
//        }else{
//            System.out.println("Invalid spin");
//        }
//       // System.out.println();
//    }

//    public static void score(){
//
//    }
}
