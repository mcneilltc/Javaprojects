import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello World");


        int[] name = new int[5];
        int[] name2 = new int [5*2];

        ArrayList<Integer> name3 = new ArrayList<>();// O(1)
        //add an array and items to the array
        name3.add(12);
        for(int i = 0; i < 4000; i++)// O(n)
            name3.add(i);

        int n = 16;
        System.out.println("log n");
                for (int i =1; i <n; i=i*2){
                    System.out.println("Hey I'm busy looking at:" + i);// O(log(n))
                }
        System.out.println("k^n");
         // O (k^n)
//        for(int i=1; i <=Math.pow(2,n); i++){
//            System.out.println("Hey I'm busy looking at:" + i);
//        }


        System.out.println(name3.size());//O(1)- Big O notation
// the an exact value out of the array
        System.out.println(name3.get(2000));
        name3.set(3702, 495);//change the slot value of 3702 to 495
        //remove item in teh array
       Integer storeit= name3.remove(3702);

        System.out.println(storeit);

        takeArrayList(name3);
        printAString( "A:String");
        addNums(42, 61);
    }

    static  void takeArrayList(ArrayList<Integer>doodle){
        int total =0;
        for( Integer name : doodle){// O(n)- Big O notation
            total += name;
        }
        System.out.println(total);
    }
static void printAString(String s){
    System.out.println(s);
}
static void addNums (int a, int b){
    System.out.println(a+b);
}
}
