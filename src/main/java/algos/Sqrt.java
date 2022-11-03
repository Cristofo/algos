package algos;

public class Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }

    public static int mySqrt(int x) {
        // 4 = 2
        // 8 = 2
        // 10 = 1
        // 100 = 10
        // 1000 = 31
        // 10000 = 100
        // 100000= 316
        // 1000000 = 1000
        // 10000000 = 3162
        // 100000000 = 10000
      // if(x < 2 ) return x;
      // if(x == 2 || x == 3) return 1;
       /*if(String.valueOf(x).length()%2==0){
           int i = String.valueOf(x).length() - 3;
       }*/

       long root = 0;
       long low = 0;
       long high = x;
       while(low+1 < high){
           root = (high+low)/2;
           if(root*root == x){
               return (int) root;
           } else if(root*root > x){
               high = root;
           } else {
               low = root;
           }
        }
       if(high*high == x) return (int) high;

        return (int) low;

       /* while(root*root < x){
            root++;
        }
        return (int) ((root)*(root) == x? root:root-1);


        /*
        * if(x <= 1)
            return x;
        int l = 0;
        int r = x;
        while (l <= r) {
            int m = (l + r) / 2;
            if (m == x / m)
                return m;
            else if (m > x / m)
                r = m - 1;
            else
                l = m + 1;
        }
        return r;*/
        //l 0  - r 8   - x 18  -  m 4

    }
}

