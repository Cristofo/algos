package algos;

import java.util.HashMap;
import java.util.Map;

public class ReverseVowels {
/**
 * Given a string s, reverse only all the vowels in the string and return it.
 *
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "hello"
 * Output: "holle"
 * Example 2:
 *
 * Input: s = "leetcode"
 * Output: "leotcede"
 *
 * */


    public static void main(String[] args) {
        String s = "hello";



        System.out.println(reverseVowels(s));

    }

    public static String reverseVowels(String s) {
        Map<Character,Character> vowelHash = new HashMap<>();
        vowelHash.put('a','a');
        vowelHash.put('e','e');
        vowelHash.put('i','i');
        vowelHash.put('o','o');
        vowelHash.put('u','u');
        vowelHash.put('A','A');
        vowelHash.put('E','E');
        vowelHash.put('I','I');
        vowelHash.put('O','O');
        vowelHash.put('U','U');
        int ini = 0;
        int fin = s.length()-1;
        char[] myCharArray = s.toCharArray();


        while(ini < fin){

            if(null == vowelHash.get(myCharArray[fin]) && null == vowelHash.get(myCharArray[ini])){
                ini++;
                fin--;
                continue;
            }else if(null == vowelHash.get(myCharArray[fin])){
                fin--;
                continue;

            } else if(null == vowelHash.get(myCharArray[ini])){
                ini++;
                continue;
            }

            char tmp = myCharArray[ini];
            myCharArray[ini] = myCharArray[fin];
            myCharArray[fin] = tmp;

            ini++;
            fin--;
        }

        return new String(myCharArray);
    }
}
