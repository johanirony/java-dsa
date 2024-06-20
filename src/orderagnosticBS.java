public class orderagnosticBS {
    public static void main(String[] args) {
        int[] arr = {100,98,75,54,12,9,-1};
        int target =12;
        int ans= orderagnosticBs(arr,target);
        System.out.println(ans);

    }
    static int orderagnosticBs(int[] arr , int target){
        int start=0;
        int end= arr.length-1;
        //check if array is ascending or not
        boolean isAsc= arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid]){
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}
