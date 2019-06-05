import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {

        int numb1= 0;
        int numb2 =0;
        char operator;
        //double numb = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        numb1 = scanner.nextInt();
        System.out.println("Enter you second number: ");
        numb2 = scanner.nextInt();
        System.out.println("Which operation do you want to use?" +
                " Add + ,  Subtract - , Multiply *  , or Divide / ");
        operator = scanner.next().charAt(0);

add(numb1, numb2);
Subtract(numb1, numb2);
Multiply(numb1, numb2);
Divide(numb1, numb2);
//        public static void Mutiply(){}
//
//        public static void Divide(){}
    }// main
    public static int add(int a, int b){
        int add2 = a + b;
        System.out.println(add2);
        return add2;
    }
    public static int Subtract(int a, int b){
        int sub2 = a-b;
        System.out.println(sub2);
        return sub2;
    }
public static int Multiply(int a, int b){
        int multi = a*b;
    System.out.println(multi);
    return multi;
}
public static int Divide(int a, int b) {
    int div = a / b;
    if(b !=0) {
        System.out.println(div);

    } return div;
}
}// class Calc
