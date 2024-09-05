package gfgquestions;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr={4,5,6,1,2,3};

        System.out.println(sort(arr));

    }
    static int secondlargest(int[] arr){
        if(arr.length<2){
            return -1;
        }
        int first, second;
        first=second=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second = first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second = arr[i];
            }

        }
        if(second == Integer.MIN_VALUE){
            return -1;
        }
        else {
            return second;
        }
    }
    static boolean sort(int[] arr){
        int n=arr.length;
        int count = 0;
        for(int i =0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }
        }
        return count <=1;
    }
}
