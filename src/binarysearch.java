public class binarysearch {
    // array should be sorted here its in ascending order
    //for descending order just change start and end conditions
    public static void main(String[] args) {
        int[] arr = {-1,2, 4 ,12,22, 122};
        int target =12;
        int ans= binary(arr,target);
        System.out.println(ans);

    }
    static int binary(int[] arr , int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
