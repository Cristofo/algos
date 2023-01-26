package algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Picks {

    public static void main(String[] args) {
        picks();
    }


    private static void picks() {

        List<Integer> aList = Arrays.asList(10,9,8,7,6,5,4,3,2,1,0);

        List<Integer> picksList = new ArrayList<>();
        Integer previous = aList.get(0);

        for (int i = 1; i < aList.size() - 1; i++) {
            int current = aList.get(i);
            int next = aList.get(i + 1);
            if (current > next &&  current > previous ) {
                picksList.add(current);
            }
            previous = current;
        }
        int lastElement = aList.get(aList.size() - 1);
        if (lastElement > aList.get(aList.size() - 2))
            picksList.add(lastElement);

        System.out.println(picksList);
    }
}
