package week08;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char[] letters = {'j','a','v','a',' ','i','s',' ','f','u','n'};

        for (char letter : letters) {
            System.out.print(letter+" ");
        }
        System.out.println();
        String sentence = new String(letters);
        System.out.println("sentence = " + sentence);

        // there is apposite of the action

        char [] newArray = sentence.toCharArray();
        for (char c : newArray) {
            System.out.print(c+" ");
        }


        int [] countOfEachChar = new int[26];  // I will turn a word into an array of int where each char is stored to its location

     /*
     [0, 0, 0, 0, ..............]
     word = acc;
     [ 1, 0, 2, 0 , 0 ...... ]
     ASCII
     'a' = 97
     'b' = 98
     countOfEachChar['a'-97] =  countOfEachChar['a'-97] + 1;

      */

        System.out.println("---Before putting the word into my int array------");
        System.out.println(Arrays.toString(countOfEachChar));

        String word = "silent";

        for (char letter : word.toCharArray()) {
            System.out.println("letter = " + letter);
            countOfEachChar[letter-97] = countOfEachChar[letter-97]+1;
            System.out.println("----After putting the letter into its index----------");
            System.out.println(Arrays.toString(countOfEachChar));
        }

        String word2 = "listen";
        for (char letter : word2.toCharArray()) {
            System.out.println("letter = " + letter);
            countOfEachChar[letter-97] = countOfEachChar[letter-97]-1;
            System.out.println("----After putting the letter into its index----------");
            System.out.println(Arrays.toString(countOfEachChar));
        }


        int[] emptyArray = new int[26];

        System.out.println("Are the words Anagram ? "+ Arrays.equals(countOfEachChar,emptyArray));

    }
}
