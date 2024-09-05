public class binarysearch {
    // array should be sorted here its in ascending order
    //for descending order just change start and end conditions
    public static void main(String[] args) {
        int[] arr ={1,2,4,5,6};
        int target =17;

        boolean ans = armstrong(35);
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
        return start ;
    }
    static int squareroot(int x){
        if(x==0 || x==1){
            return x;

        }
        int start =1;
        int end = x;
        while (start<=end){
            int mid = start + (end-start)/2;
            if((long)mid*mid>(long)x){
                end = mid-1;
            }
            else if (mid*mid==x){
                return mid;
            }
            else {
                start = mid+1;
            }
        }
        return Math.round(end);
    }
    static int countdigits(int n){
        if (n==0){
            return 1;
        }
        int count =0;
        while (n>0){

            count +=1;
            n=n/10;
        }
        return count;
    }
    static boolean armstrong (int n){
        int og =n ;
        int x=0;
        while (n > 0) {
            int digit = n %10;
            x = x + (digit * digit * digit);
            n = n/10;

        }
        return x == og;
    }
}
