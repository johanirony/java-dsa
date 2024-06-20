public class infinitearrayBS {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,8,10,23,24,26,30,33};
        int target=23;
        int ans=ans(arr,target);
        System.out.println(ans);

    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newS=end+1;
            end=end+(end-start+1)*2;
            start=newS;
        }
        return binary(arr,target,start,end);
    }
    static int binary(int[] arr , int target,int start , int end){

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
