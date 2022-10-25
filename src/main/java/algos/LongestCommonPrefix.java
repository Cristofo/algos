package algos;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"a"};

        char prefix = strs[0].charAt(0);
        int i = 0;
        int j = 0;
        String prefixFin = "";

        myloop: for(;j < strs[i].length();j++){
                prefix = strs[i].charAt(j);
                for(;i < strs.length; i++){
                    if( strs[i].length()-1 < j || strs[i].charAt(j) != prefix) break myloop;

                }
                i = 0;
                prefixFin += strs[i].charAt(j);

        }
        System.out.println(prefixFin);
    }

}
