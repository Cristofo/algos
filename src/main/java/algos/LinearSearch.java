package algos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinearSearch {

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(0, 100).boxed().collect(Collectors.toList());
        int target = 100;
        linearSearch(list, target);

    }

    static void linearSearch(List<Integer> list, int target){

       try{
        list.stream().forEach(value -> {

            if(value==target){
                System.out.println(value);
                throw new RuntimeException();
            }

        });
    } catch (Exception e) {
           System.out.println("not found");
       }

    }


}
