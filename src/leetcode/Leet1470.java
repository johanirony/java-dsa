package leetcode;

import java.util.Arrays;

public class Leet1470 {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        System.out.println((Arrays.toString(shuffle(arr,3))));

    }
    static int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        for(int i =0; i<n; i++){
            shuffled[2*i]=nums[i];
            shuffled[2*i+1]=nums[n+i];
        }
        return shuffled;
    }
}
