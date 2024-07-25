import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
//did not pass test case 3
public class dobra {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //take line into string and into char array
        //find _ and replace with valid chars nd check if word is plesant

        String s = kb.nextLine();
        char[] c = s.toCharArray();
        //replace every _ with  vowel or L and check if plesant
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '_') {
               
            }
        }

        
    }

    //cannot contain 3 sequential vowels, 3 sequential consonants, and at least one letter L
    public boolean isPlesant(char[] c) {
        boolean hasL = false;
        boolean threeVowels = false;
        boolean threeConsonants = false;

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < c.length; i++) {
            char ch = c[i];
            if (ch == 'L' || ch == 'l') {
                hasL = true;
            } else if (isVowel(ch)) {
                vowelCount++;
                consonantCount = 0;
                if (vowelCount >= 3) {
                    threeVowels = true;
                    break;
                }
            } else {
                consonantCount++;
                vowelCount = 0;
                if (consonantCount >= 3) {
                    threeConsonants = true;
                    break;
                }
            }
        }

        return hasL && !threeVowels && !threeConsonants;
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }


}
