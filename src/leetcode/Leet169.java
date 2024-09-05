package leetcode;

import java.util.Arrays;

public class Leet169 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4};
        System.out.println(majorityElement(arr));

    }
    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2];

    }
}
