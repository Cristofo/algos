package algos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RecursiveLinearSearch {

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(0, 1000).boxed().collect(Collectors.toList());
        int target = 1;
        System.out.println(recursiveLinearSearch(list, target)==null?"Not found":target);

    }

    static Integer recursiveLinearSearch(List<Integer> list, int target){

       if(list.isEmpty()) return null;

       // we check the last element from the list
       if(list.get(list.size()-1)== target) return target;

       //we delete the last element
       list.remove(list.size()-1);

       // we call the funcion again
       return recursiveLinearSearch(list, target);
    }


}
