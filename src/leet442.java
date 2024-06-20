import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leet442 {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        int[] ans =findDuplicates(arr);
        System.out.println(Arrays.toString(ans));





    }
    static int[] findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctindex=nums[i]-1;
            if(nums[i]!=nums[correctindex]){
                swap(nums,i,correctindex);
            }
            else {
                i++;
            }
        }

        for(int a=0;a<nums.length;a++){
            if(nums[a]!=a+1){
                return new int[]{nums[a],a+1};
            }
        }
        return new int[]{-1,-1};

    }
    static void swap(int[] arr,int i,int correctindex){
        int temp =arr[i];
        arr[i]=arr[correctindex];
        arr[correctindex]=temp;

    }

}
