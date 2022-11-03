package algos;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String phrase = "Hello World hi   ";

        System.out.println(lengthOfLastWord(phrase));
    }

    public static int lengthOfLastWord(String s) {


        int i = s.length()-1;
        int count = 0;
        while(i >= 0){
            if(s.charAt(i) !=  ' '){
                count = count +1;
            }else if(s.charAt(i) == ' ' && count > 0) break;
            i--;
        }

        return count;
    }
}
