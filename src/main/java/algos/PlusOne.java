package algos;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        /*
        * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.*/
        int [] nums = {9,8,9,9};

        Arrays.stream(plusOne(nums)).forEach(System.out::println);

    }

    public static int[] plusOne(int[] digits) {

        int i = digits.length-1;
        int plus = 0;
        while (i >= 0){
            if(digits[i] == 9 && plus == 0){
                digits[i] = 0;

            }else if(plus == 0){
                digits[i] = digits[i]+1;
                plus = plus +1;
            } else{
                digits[i] = digits[i];
            }
            i--;
        }

        if(digits[0] == 0 ){
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            return newDigits;
        }

        return  digits;
    }


}
