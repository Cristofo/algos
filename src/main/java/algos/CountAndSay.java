package algos;



public class CountAndSay {

    public static void main(String[] args) {

        System.out.println(countAndSay(9));
    }

    public static String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String valRet = countAndSay(n-1);

        var first = valRet.charAt(0);
        StringBuilder retornar = new StringBuilder();
        int count = 0;
        for(char charVal :valRet.toCharArray()){
            if(first == charVal){
                count++;
                continue;
            }
            retornar.append(count);
            retornar.append(first);

            first = charVal;
            count = 1;
        }
        retornar.append(count);
        retornar.append(first);
        return retornar.toString();

    }
}

