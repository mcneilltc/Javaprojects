import java.util.ArrayList;

public class Vowels {
    static ArrayList<Character> vowels;
    private String solvedPuzzle;

    //public Vowels(Vowels vowels) {
//        this.vowels = vowels;
//    }

    public static void isVowel() {
        vowels = new ArrayList<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        //return vowels.indexOf();

        System.out.println(vowels);

    }

    public static void letters() {
        isVowel();
        ArrayList<Character> otherlets = new ArrayList<>();
        for (int i = 65; i <= 90; i++) {
            if (!vowels.contains((char) i)) {
                otherlets.add((char) i);
            }
        }
        System.out.println(otherlets);
    }

    public int instances(Character otherlets) {// # of instances a letter appears in puzzle
        int count = this.solvedPuzzle.length() - this.solvedPuzzle.replace(otherlets.toString(), "").length();
        String text = "There are ";
        if (count == 0) {
            text = "There is ";
        }
        System.out.println(text + count + "\"" + otherlets + "\"'s");
        return count;
    }

    public int vowinstances(Character vowels) {//# of instances a vowel appears in puzzle
        int count = this.solvedPuzzle.length() - this.solvedPuzzle.replace(vowels.toString(), "").length();
        String text = "There are ";
        if (count == 0) {
            text = "There is ";
        }
        System.out.println(text + count + "\"" + vowels + "\"'s");
        return count;
    }

    public int guessLetter(Character otherlets) {//guessing a letter out of the consonants
        otherlets = Character.toUpperCase(otherlets);
        //boolean spinw = true;
        if (Character.isLetter(otherlets) == false) {
            System.out.println("No \"" + otherlets + "\" is not in the puzzle.");
            return 0;
        } else {
            return Spin.spinWheel() * instances(otherlets);
        }//end of guesslesster
    }
        public int buyvowel(Character vowels){//buying a vowel out of those available
            vowels = Character.toUpperCase(vowels);
            if (Character.isLetter(vowels) == false) {
                System.out.println("That \"" + vowels + "\" is not in the puzzle.");
                return 0;
            } else {
                return -50 * vowinstances(vowels);
            }
        }

}