public class leet287 {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);

    }
    static int findDuplicate(int[] nums) {
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
        int ans=0;

        for(int a=0;a<nums.length;a++){
            if(nums[a]!=a+1){
                ans=nums[a];
            }
        }
        return ans;

    }
    static void swap(int[] arr,int i,int correctindex){
        int temp =arr[i];
        arr[i]=arr[correctindex];
        arr[correctindex]=temp;

    }
}
