package algos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RecursiveBinarySearch {

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());
        int target = 1;
        //list.subList(5, list.size()).forEach(System.out::println);
        System.out.println(recursiveBinarySearch(list, target)==false?"Not found":"It was found "+target);

    }

    static boolean recursiveBinarySearch(List<Integer> list, int target){


       if(list.isEmpty()) return false;

       int low = list.get(0);
       int high = list.get(list.size()-1);

       // we obtain the middle point, our guess
       int guess = (high+low)/2;

       if(guess == target)
           return true;
       else if (guess > target) {
           return recursiveBinarySearch(list.subList(low, guess), target);
       } else {
           return recursiveBinarySearch(list.subList(guess+1, list.size()), target);
       }

    }


}
