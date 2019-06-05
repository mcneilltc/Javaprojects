import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number of discs:");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        solve(discs, "A", "B", "C");
    }
    public static void solve(int numRings, String start, String auxiliary, String end) {
        if (numRings == 1) {
            System.out.println(start + "->" + end);
        } else {
            solve(numRings - 1, start, end, auxiliary);
            System.out.println(start + "->" + end);
            solve(numRings - 1, auxiliary, start, end);
        }
    }
            }//end MAIN

//        Stack<Integer> tower1 = new Stack<>();
//        Stack<Integer> tower2 = new Stack<>();
//        Stack<Integer> tower3 = new Stack<>();
//
//        tower1.push(3);
//        tower2.push(2);
//        tower3.push(1);
//p();
//
//
//    }// end public main
//    public static void move(int numRings, int startPole, int endPole){
//        if(numRings ==0){
//            return;
//        }
//        int intermediatePole = 6 - startPole - endPole;
//        move(numRings-1, startPole, intermediatePole);
//        System.out.println(("Move" + numRings + "from"  + startPole + "to" + endPole));
//        move(numRings-1, intermediatePole, endPole);
//    }
//    //towerOfHanoi(3, 'A', 'B', 'C');
//static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod){
//        if(n==1){
//            System.out.println("Move disk 1 from rod" + from_rod + "to rod" + to_rod);
//            return;
//        }
//        ///first iteration n=2, 'A', 'C', 'B'
//        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
//    System.out.println("Move disk"+ n + "from rod" + from_rod + "to rod"+ to_rod);
//    towerOfHanoi(n-1, aux_rod, to_rod, from_rod);

//    static int count=0;
//    static void p(){
//        count++;
//        if(count<=5){
//            System.out.println("hello " + count);
//            p();
//        }
//    }
//Step1: Move (n-1) discs from pole1 to pole2
    //Step 2: move the nth disc (last disc) from pole1 to pole3.
    //Step3: now move the n-1 discs which is present in pole2-pole3
    //step1 and step3 will be recursive.

//System.out.print("Enter number of discs:")
//    Scanner scanner = new Scanner(System.in);
//    int discs = scanner.nextInt();
//    solve(discs, "A", "B", "C");
//
//    public static void solve(int numRings. String start, String auxiliary, String end){
//        if(numRings ==1){
//            System.out.println(start + "->" + end);
//        }else {
//            solve(numRings -1, start, end, auxiliary);
//            System.out.println(start + "->" + end);
//            solve(numRings -1, auxiliary, start, end);


