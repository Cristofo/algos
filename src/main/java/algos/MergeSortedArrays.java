package algos;

public class MergeSortedArrays {

    /**
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
     * representing the number of elements in nums1 and nums2 respectively.
     *
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     *
     * The final sorted array should not be returned by the function,
     * but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
     * where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     *
     *
     *
     * Example 1:
     *
     * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * Output: [1,2,2,3,5,6]
     * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
     * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
     * Example 2:
     *
     * Input: nums1 = [1], m = 1, nums2 = [], n = 0
     * Output: [1]
     * Explanation: The arrays we are merging are [1] and [].
     * The result of the merge is [1].
     * */

    public static void main(String[] args) {

        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        merge(nums1, 3,nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n==0) {
            return;
        }else if (m == 0){
            nums1[0] = nums2[0];
        }

        int i = m-1;
        int j = 0;
        while(j < n){
            while(i >= 0){
                if(nums2[j]< nums1[i]){
                    nums1[i+1] = nums1[i];// Move higher 1 position ahead
                    nums1[i] = nums2[j]; // Put lower in the curret position
                }else {
                    nums1[i+1] = nums2[j]; // put the higher or equal one position ahead and we go to the next in list nums2
                    break;
                }
                i--;
            }
            i=m+j;
            j++;
        }

    }


}
