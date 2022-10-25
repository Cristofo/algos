package algos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        System.out.println(canConstruct("acdcab", "abbcabcdd"));
        System.out.println(LocalDateTime.now().toString());
        //String format = LocalDateTime.parse(LocalDateTime.now().toString()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm 'hrs.'"));
        String fechaHoraLD = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(fechaHoraLD);

        List<List<Integer>> listRetorno = new ArrayList<>();
        listRetorno.add(Arrays.asList(-1,0,1));
        listRetorno.add(Arrays.asList(-1,2,-1));
        listRetorno.add(Arrays.asList(0,1,-1));
        listRetorno.stream().forEach(val -> {

        });
        int val = -121;


        String myString = String.valueOf(121);

        int i = 0;
        int j = myString.length();
        int mitad = j/2;
        String subSubstring1 = myString.substring(0,mitad);
        String subSubstring2 = myString.substring(mitad);
        System.out.println(subSubstring1);
        System.out.println(subSubstring2);

        if(subSubstring1.length() == subSubstring2.length()){
            if((Long.valueOf(subSubstring1) - Long.valueOf(new StringBuilder(subSubstring2).reverse().toString())) == 0)
                System.out.println("par true");
        } else{
            subSubstring2 = myString.substring(mitad+1);
            if((Long.valueOf(subSubstring1) - Long.valueOf(new StringBuilder(subSubstring2).reverse().toString())) == 0)
                System.out.println("impar true");
        }

        System.out.println(isPalindrome(2222222));





    }

    static public class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] ind = new int[26];
       int[] val= new int[]{1,2,3};
        int index=0;
        for(char c : ransomNote.toCharArray())
        {
            index = magazine.indexOf(c, ind[c - 'a']);
            if (index == -1) return false;
            ind[c - 'a'] = index+1;
        }
        return true;
    }


    public static boolean isPalindrome(int x) {
        if (x<0 || x%10 == 0 && x !=0){
            return false;
        }

        String myString = String.valueOf(x);

        if(myString.length() == 1) return true;
        int lastPart = myString.length()/2;

        int i = lastPart;
        int j = myString.length()%2 ==0?lastPart:lastPart+1;
        return Long.parseLong(myString.substring(0, i)) ==  Long.parseLong(new StringBuilder(myString.substring(j)).reverse().toString());

    }
}
