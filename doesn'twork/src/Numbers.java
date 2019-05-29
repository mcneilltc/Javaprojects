import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
//        AsciiChars.printNumbers();
//        AsciiChars.printUpperCase();
//        AsciiChars.printLowerCase();
        LotteryNumbers();
        Enter();
    }
    public static void Enter(){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String strname = name.next();
        System.out.println(String.format("Hello %s", strname));
        System.out.println("Would you like to continue to the interactive portion Y/N?");
        char answer = name.next().toLowerCase().charAt(0);
        if (answer == 'n'){
            System.out.println("Please come back to finish the survey later");
        }else if(answer == 'y'){
            //Survey();
        }else{
            System.out.println("You have an invalid response");
        }
    }
    public static class Survey {// figure out a way to randomize the questions
        static Scanner name = new Scanner(System.in);

        public static int petName() {
            System.out.println("What is the name of your favorite pet");
            char pet = name.next().charAt(2);
            int petInt = pet;
            if (petInt > 65) {
                petInt = petInt % 65;
            }
            return petInt;
        }
//        public static int petAge() {
//            System.out.println("How old is your favorite pet");
//            int age = name.nextInt();
//            if (age > 65) {
//                age = age % 65;
//            }
//            return age;
//        }
        public static int color() {
            System.out.println("What is your favorite color");
            char colorpk = name.next().charAt(3);
            int colorInt = colorpk;
            if (colorInt > 65) {
                colorInt = colorInt % 65;
            }return colorInt;
        }

        public static int luckyNum() {
            System.out.println("What is your lucky number");
            int lucky = name.nextInt();
            if (lucky > 65) {
                lucky = lucky % 65;
            }
            return lucky;
        }

//        public static int quarterBack() {
//            System.out.println("Do you have a favorite Quarterback Y/N?");
//            char answer = name.next().toLowerCase().charAt(0);
//            if (answer == 'n') {
//                System.out.println("What's your favorite athletes jersey number?");
//            } else if (answer == 'y') {
//                System.out.println("What is their jersey number?");
//            } else {
//                System.out.println("You have an invalid response try again");
//            }
//            int QB = name.nextInt();
//            if (QB > 65) {
//                QB = QB % 65;
//            }
//            return QB;
//        }

        public static int carnum() {
            System.out.println("What is the two-digit model year of your car?");
            int model = name.nextInt();
            if (model > 65) {
                model = model % 65;
            }
            return model;

        }

        public static int actorName() {
            System.out.println("What is the first name of your favorite Actress or Actor");
            char actor = name.next().charAt(0);
            int actorInt = actor;
            if (actorInt > 65) {
                actorInt = actorInt % 65;
            }
            return actorInt;
        }

        public static int randomnumber() {
            System.out.println("Enter a random number between 1 and 50");
            int number = name.nextInt();
            if (number > 50 || number < 1) {
                System.out.println("A number GREATER than 0 LESS than 51");
            }
            return number;
        }

    }
    public static class random{
        static Random random = new Random();
        public static int random1(){
            int randy1 = random.nextInt(50)+1;
            return randy1;
        }
        public static int random2(){
            int randy2 = random.nextInt(65)+1;
            return randy2;
        }
        public static int random3(){
            int randy3 = random.nextInt(75)+1;
            return randy3;
        }
    }
//public static class Numbergen{
//int random1 = (int)(Math.random()* 65 + 1);
//}
public static class lottoNumbers {
    public static int magicnum() {
        int lucky = Survey.luckyNum();
        int random1 = random.random1();
        int resultLucky = lucky * random1;
        if (resultLucky > 65) {
            resultLucky = resultLucky%65;
        }
        return resultLucky;
    }
    public static int pick1(){
        int random3 = random.random3();
       int pet = Survey.petName();
       int resultpk1 = pet * random3;
       if(resultpk1 >65){
           resultpk1 = resultpk1%65;
       }return resultpk1;
    }

public static int pick2(){
        int model= Survey.carnum();
        int lucky = Survey.luckyNum();
        int resultpk2 = model + lucky;
        if(resultpk2>65){
            resultpk2= resultpk2%65;
        }
        return resultpk2;
}

public static int pick3(){
        int number = Survey.randomnumber();
        int random2= random.random2();
        int resultpk3 = number - random2;
        if(resultpk3 <=0){
            resultpk3 = resultpk3 + 65;
        }return  resultpk3;
}

public static int pick4(){
        int act = Survey.actorName();
        int resultpk4 = act* 2;
        if(resultpk4 > 65){
            resultpk4 = resultpk4%65;
        }return resultpk4;
}
public static int pick5(){
        int pet = Survey.petName();
        int colorpk = Survey.color();
        int model = Survey.carnum();
        int resultpk5 =  (pet) + (colorpk* model);
        if(resultpk5 > 65){
            resultpk5 = resultpk5%65;
        }return resultpk5;
    }
}
public static void LotteryNumbers(){
    System.out.println(String.format("Lottery Numbers: %d, %d, %d, %d, %d Magic Number: %d",
            pick1(), pick2(), pick3(), resultpk4(), pick5(),magicnum()));
}

//   public static class AsciiChars {
//       public static void printNumbers() {//print valid numeric input
//           for (int i = 48; i <= 57; i++) {
//               System.out.println((char) i);
//           }
//       }
//
//       public static void printLowerCase() {
//           // print valid lowercase alphabetic input
//           for (int i = 97; i <= 122; i++) {
//               System.out.println((char) i);
//           }
//       }
//           public static void printUpperCase () {
//               //print valid uppercase alphabetic input
//               for (int i = 65; i <= 90; i++) {
//                   System.out.println((char) i);
//               }
//           }
//
//   }
}
