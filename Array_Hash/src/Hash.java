
import java.util.*;


public class Hash {
    public static void main(String[] args) {
        numbers();
        HashMap();
        cardealer();

        ArrayList<String> animals = new ArrayList<>();
        animals.add("dogs");
        animals.add("cats");
        animals.add("bird");
        animals.add("fish");

        //foreach
        String favorite = animals.get(0);
        for (String i : animals) {
            if (i == favorite) {
                System.out.println(String.format("I love %s", favorite));
            } else {
                System.out.println("I don't care for those");
            }
        }
        //without the foreach
        if (favorite == "dogs") {
            System.out.println(String.format("I love %s", favorite));
        } else {
            System.out.println("I don't care for those");
        }
        HashMap<String, Integer> person = new HashMap<>();
        person.put("Joan" , 22);
        person.put("Daniel" , 42);
        person.put("Anna" , 34);
        System.out.println(person);
  }

    public static void HashMap(){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> person = new HashMap<>();
        System.out.println("What is your name?");
        String name = scanner.next();
        person.put("name", name);
        System.out.println("What's your Hometown?");
        String home = scanner.next();
        person.put("hometown", home);
        System.out.println("How old are you");
        String age = scanner.next();
        person.put("age", age);
        System.out.println("What is you favorite food");
        String food= scanner.next();
        person.put("food", food);
        System.out.println(String.format("This is %s, They are %s- years old, from %s, " +
                "and their favorite food is %s.", name, age, home, food));
    }

    public static void numbers(){
        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> number = new ArrayList<>();
        int numberArray[] = new int[5];
        for(int i = 0; i <5; i++){
            System.out.println(String.format("Input a number %d: ", i));
            int number = scanner.nextInt();
            numberArray[i]= number;
        }
        //for(int i : numberArray){System.out.println(i + " ");}

        int sum = 0;
        for(int i: numberArray){
            sum += i;
        }
        System.out.println("The sum of the array is:" + sum);
        int product =1;
        for (int i: numberArray){
            product *= i;
        }
        System.out.println("The product of the array is:" + product);
        Arrays.sort(numberArray);
        System.out.println("The lowest number in the array is: " + numberArray[0]);
        System.out.println("The highest number in the array is:" + numberArray[4]);


    }
    public static void cardealer(){
        HashMap<String, String> car = new HashMap<>();
        car.put("3", "mazda");
        car.put("avalon", "toyota");
        car.put("camry", "toyota");
        car.put("outback", "subaru");
        car.put("maxima", "nissan");
        car.put("mustang", "ford");
        car.put("escape", "ford");
        car.put("wrangler", "jeep");
        Scanner scanner = new Scanner(System.in);


        System.out.println("What model of car are you looking for?");
        String carpick= scanner.next();
        if (car.containsKey(carpick)){
            String make = car.get(carpick);
            System.out.println(String.format("So you are looking for a %s? Our %s " +
                    "selection is right over here.", carpick, make ));
        }else{
            System.out.println("We do not have that on out lot at this time.");
        }
    }
}



