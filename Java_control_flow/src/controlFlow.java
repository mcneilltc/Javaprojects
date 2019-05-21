import java.util.Scanner;


public class controlFlow {
    public static void main(String[] args) {
        branching();
//        char redo;// has to be created to be called in the do while loop. it has to be outside of the loop
//
//        Scanner scanner = new Scanner(System.in);
//
//        do {// the do  loop will run the program with the enter name and enter age
//            System.out.println("Enter your name: ");
//            String username = scanner.next();
//
//            System.out.println("Enter your age: ");
//            int age = scanner.nextInt();
//            //System.out.println(String.format("Hello %s, your age is %d", username, age));
//            if (age >= 16) {
//                System.out.println(String.format("%s you are old enough to drive", username));
//            } else {
//                System.out.println(String.format("%s you are not old enough to drive yet", username));
//            }
//            if (age >= 18) {
//                System.out.println(String.format("%s you are old enough to vote", username));
//            } else {
//                System.out.println(String.format("%s you are not old enough to vote yet", username));
//            }
//            if (age >= 21) {
//                System.out.println(String.format("%s you are old enough to drink", username));
//            } else {
//                System.out.println(String.format("%s you are not old enough to drink yet", username));
//            }
//            if (age >= 35) {
//                System.out.println(String.format("%s you are old enough to be President", username));
//            } else {
//                System.out.println(String.format("%s you are not old enough to be President yet", username));
//            }
//            if (age >= 55) {
//                System.out.println(String.format("%s you can join AARP", username));
//            } else {
//                System.out.println(String.format("%s you don't have to join AARP yet", username));
//            }
//            if (age >= 67) {
//                System.out.println(String.format("%s you can start drawing Social Security", username));
//            } else {
//                System.out.println(String.format("%s you can't get your money yet", username));
//            }
//            System.out.println("Do you want to redo your answers? Y - yes or N - no");
//            redo = scanner.next().toLowerCase().charAt(0);
////before the system prints out the statements based on the answers given,
//// it will give an option to run the questions again if the input is y the questions will start over,
//// if no they will go to the next part of the question
//        } while (redo == 'y');
//
//        System.out.println("Enter your employment status E - Employed, U - Unemployed or S - Student");
//        String employStat = scanner.next().toUpperCase();
//
//        System.out.println("Do you have a car, truck, suv, bike or walk? C - car, T - truck, S - Suv," +
//                "B - bike, W - walk");
//        String transport = scanner.next().toUpperCase();
//
//        switch (employStat) {
//            case "E":
//                System.out.println(" you are employed");
//                break;
//            case "U":
//                System.out.println(" you are not employed");
//                break;
//            case "S":
//                System.out.println(" you are a student");
//            default:
//                System.out.println("Invalid input");
//        }
//        switch (transport) {
//            case "C":
//                System.out.println("You drive a car");
//                break;
//            case "T":
//                System.out.println("You drive a truck");
//                break;
//            case "S":
//                System.out.println("You drive a SUV");
//                break;
//            case "B":
//                System.out.println("You ride a bike");
//                break;
//            case "W":
//                System.out.println("You walk");
//                break;
//            default:
//                System.out.println("Invalid input");
//        }

////step 3
//        int[] myArray = new int[30];
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i;
//            System.out.println(myArray[i]);
//        }
//        for (int i : myArray) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i * 2;
//            System.out.println(myArray[i]);
//        }
//        for (int i : myArray) {
//            System.out.println(i);
//        }
//
//
//        for (int i = myArray.length - 1; i >= 0; i--) {
//            System.out.println(myArray[i]);
//        }
//
////step 4 // intialized the first i in the array , where the array starts
//        //the do prints the system output, and the increment
//        // the while
//        int i = 0;
//        do {
//            System.out.println(myArray[i]);
//            i++;
//        } while (i < myArray.length);
//// the myarray.length-1 is the start point
//        //the while is comparing the i values to the placement in the array
//        i = myArray.length - 1;
//        do {
//            System.out.println(myArray[i]);
//            i--;
//        } while (i >= 0);
//
   }

    public static int branching() {

Integer n = Integer.valueOf(12);
int nn= 0;

    int[] myArray = new int[30];
    for (int i = 0; i < myArray.length; i++) {
       myArray[i]= i;
        int number= myArray[i];
       //System.out.println(myArray[i]);
if(number%2 != 0){
            System.out.println(number);
        }
if(number%2 == 0){
nn = nn + myArray[i];
}
if(number == n){
    break;
}
    }return nn;
}


}




