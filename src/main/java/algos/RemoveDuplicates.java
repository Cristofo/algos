package algos;

public class RemoveDuplicates {
//Remove Duplicates from Sorted Array

    public static void main(String[] args) {

        int [] nums = {0,0,1,1,2};

        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
        //0 1 1 1

        if(nums.length == 1) return 1;

        int current = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if(current != nums[i]){
               current = nums[i];
               nums[count] = nums[i];
               count++;
            }
        }

        return count;
    }
}
