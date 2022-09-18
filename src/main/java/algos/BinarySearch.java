package algos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinarySearch {

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(0, 100).boxed().collect(Collectors.toList());
        int target = 100;
        System.out.println(binarySearch(list, target));
    }


    static Integer binarySearch(List<Integer> list, int target){
        int high = list.size()-1;
        int low = 0;
        int guess = 0;
        while(low <= high){
            System.out.println("guess number"+guess);
            guess = (high+low)/2;

            if(guess == target){
                return guess;
            }else if(guess > target){
                high = guess-1;
            } else if(guess < target){
                low = guess+1;
            }
        }
        return null;
    }
}
