public class javalab {
    public static void main(String[] args) {
        //step1();
        //step3();
        step4();
        anotherMethod();
        playWithStrings();
    }
        static void step1() {
            int firstInt = 6;
            System.out.println(firstInt);
            int secondInt = 20;
            System.out.println(secondInt);
            int thirdInt = 0;
            System.out.println(thirdInt);
            float someValue = 4.4f;
            System.out.println(someValue);
            boolean isCold = false;
            System.out.println(isCold);
            double anotherValue = 231_123;
            System.out.println(anotherValue);


            //step 2
                int addTwoInt = firstInt + secondInt;
                System.out.println(addTwoInt);
                int addanother = firstInt + thirdInt;
                System.out.println(addanother);
                int divTwo = secondInt / firstInt;
                System.out.println(divTwo);
                System.out.println(secondInt % firstInt);
                int firstOut = (secondInt % firstInt) + firstInt;
                System.out.println(++firstOut);
        }

        //step 3
    static void step3 () {
        int x = 100;
        // boolean y = x==106;
        //System.out.println(y);
        int y = 106;
        boolean compare = x > y;
        System.out.println(compare);
        boolean compare2 = x < y;
        System.out.println(compare2);
        boolean compare3 = x >= y - 6;
        System.out.println(compare3);

        int z = 92;
        boolean comparez = x < y && y < z;
        System.out.println(comparez);
        boolean comparez2 = y < z && x >= y;
        System.out.println(comparez2);
        boolean comparez3 = z > y + x || x - y < z;
        System.out.println(comparez3);
        boolean check1 = x < y;
        boolean check2 = x > y;
        boolean comparec = check1 == !check2;
        System.out.println(comparec);
    }
        // step4
public static void step4() {
    int n = 64;
    System.out.println(n>>1);
    System.out.println(n<<1);
    System.out.println(n>>2);
    System.out.println(n<<2);
    int a = 45;
    System.out.println(a>>1);
    //with an odd number there is no rounding up
    System.out.println(a<<1);

}
//step5 and 6
 static void anotherMethod() {
     Integer a = Integer.valueOf("2000");
     Integer n = Integer.valueOf("100");
     //int n = 100;
     if (a > n) {
         //int o = n/2;
         System.out.println(n + " is less than " + a);
         System.out.println(n.compareTo(a));
     } else {
         System.out.println(n + " is greater than " + a);
         System.out.println(a.compareTo(n));
     }
 }
 static void playWithStrings(){
        String firstName = new String("Tiquila ");
        String lastName= new String("McNeill");
        String name = firstName.concat(lastName);
     System.out.println("Hello " + name);
     System.out.println("Hello " + firstName + lastName);
 }
    }
