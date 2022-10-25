package algos;

import java.nio.charset.Charset;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pangram {

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        int i = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        long count = sentence.chars().filter(charValue -> alphabet.chars()
                .anyMatch(charAlpha -> charValue == charAlpha)).distinct().count();
        
        while(i < alphabet.length()){
            System.out.println(alphabet.substring(i,i+1));
            if(!sentence.contains(alphabet.substring(0, i))) break;
            i = i+1;
        }

        System.out.println(count);

    }
}
