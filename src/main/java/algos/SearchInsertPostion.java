package algos;

public class SearchInsertPostion {
/*
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.*/



    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));

    }


    public static int searchInsert(int[] nums, int target) {

        //return nums[0] > target?  0:  1;

        int largo = nums.length;

        int high = nums.length-1;
        int low = 0;

        int searchPoint = largo/2;


        while(low <= high){
             searchPoint = (high+low)/2;
            if(nums[searchPoint] == target){
                return searchPoint;

            } else if (nums[searchPoint] > target) {

                high = searchPoint-1;
            } else if(nums[searchPoint] < target){
                low = searchPoint+1;
            }
        }

        return nums[searchPoint] > target? searchPoint:searchPoint+1;


    }
}
