package algos;

import java.util.HashMap;

public class RomanNumbers {


    public static void main(String[] args) {
        System.out.println(romanToInt("CMI"));
    }

    public static int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int i = s.length()-1;
        int sum = 0;
        while(i > 0){
            if(map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                sum += map.get(s.charAt(i)) - map.get(s.charAt(i-1));
                i = i-2;
            }else{
                sum += map.get(s.charAt(i));
                i= i-1;
            }
        }
        int lastValue = map.get(s.charAt(0)) >= map.get(s.charAt(1))?map.get(s.charAt(0)):0;
        return sum+lastValue;
    }
}
