package algos;

public class ClimbingStairs {

    /*
    * You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*
* Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
*
* Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
*
* * Input: n = 4
Output: 5
Explanation: There are 5 ways to climb to the top.
1. 1 step + 1 step + 1 step + 1 step
2. 1 step + 1 step + 2 steps
3. 2 steps + 1 step + 1 step
4. 1 step + 2 steps + 1 step
5. 2 steps + 2steps
*
* * Input: n = 6
Output:
Explanation: There are  ways to climb to the top.
1. 1 step + 1 step + 1 step + 1 step + 1 step + 1step
2. 1 step + 1 step + 1 step + 1 step + 2 steps
3. 1 step + 1 step + 2 steps + 2 steps
4. 1 step + 2 steps + 2 step + 1 step
5. 2 steps + 1 step + 1 step + 1 step + 1 step
6. 2 steps + 2 steps + 1 step + 1 step
7. 2 steps + 1 step + 2 steps + 1 step
8. 2 steps + 1 step + 1 step + 2 steps
9. 1 step + 2 steps + 1 step + 2 steps
*
*
4 5
5 8
6 13
7 21
8 34
9 55
10 89
11 144
*/

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }

    public static int climbStairs(int n) {

        int one = 1, two = 1;

        for (int i = 0; i < n-1; i++){

            var tmp = one;
            one = one + two;
            two = tmp;
        }

        return one;
    }
}


