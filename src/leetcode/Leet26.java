package leetcode;

public class Leet26 {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        System.out.println(removeduplicates(arr));

    }
    static int removeduplicates(int[] nums){
        int j=1;
        for(int i=1;i< nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
