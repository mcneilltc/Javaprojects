import java.util.ArrayList;

public class Vowels {
    static ArrayList<Character> vowels;
 public static void buyvowel(){
     vowels = new ArrayList<>();
     vowels.add('A');
     vowels.add('E');
     vowels.add('I');
     vowels.add('O');
     vowels.add('U');
     int v;
int buyvow = v * -50;
switch(buyvow){
    case 1:

        break;
}
    }
    public static void letters(){
     ArrayList<Character> otherlets = new ArrayList<>();
     for(int i = 65; i<=90; i++){
         if(!vowels.contains((char)i)){
             otherlets.add((char) i);
         }
     }
    }
}
