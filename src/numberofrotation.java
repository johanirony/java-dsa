public class numberofrotation {
    public static void main(String[] args) {
        int[] arr={12,13,14,15,1,2,3};
        System.out.println(noofrotation(arr));

    }
    static int noofrotation(int[] arr){
        int pivot=pivot(arr);
        if (pivot==0){
            return 0;
        }
        return pivot+1;

    }
    static int pivot (int[] nums ){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            if (start==end){
                return end;
            }
            if (end>start){
                return 0;
            }
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;

            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;

            }
            if(nums[mid]<=nums[start]){
                end=mid-1;
            }

            else{
                start=mid+1;

            }
        }
        return start;

    }
}
