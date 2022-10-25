package algos;

public class FindPeakElement {


    public static void main(String[] args) {
       /* Input: nums = [1,2,3,1]
        Output: 2
        Explanation: 3 is a peak element and your function should return the index number 2.*/
        int[] nums = {-2147483648,-2147483647};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums){

        var i = 0;
        var peakPos = 0;
        var peakValue = Integer.MIN_VALUE;
        while(i < nums.length){
            if(nums[i] > peakValue) {
                peakPos = i;
                peakValue = nums[i];
            }
            i++;
        }

        return peakPos;
    }

}
